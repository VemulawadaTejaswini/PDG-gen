import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.PriorityQueue;
import java.math.BigInteger;
import java.math.BigDecimal;
      
public class Main{
  
static final InputStream in=System.in;
static final PrintWriter out=new PrintWriter(System.out);
static final int INF=Integer.MAX_VALUE/2;
static final long LINF=Long.MAX_VALUE/2;
static int MAX=100000;
static char[] str=new char[MAX+1];
  
public static void main(String[] args) throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(in));
  int n=Integer.parseInt(br.readLine());
  while(n-->0){
    String line=br.readLine();
    int cur=0;
    for(int i=0;i<=MAX;i++) str[i]='-';
    for(int i=0;i<line.length();i++) str[i]=line.charAt(i);
    int m=Integer.parseInt(br.readLine());
    while(m-->0){
      String[] com=br.readLine().split(" ");
      if("forward".equals(com[0])){
        if("char".equals(com[1])&&str[cur]!='-') cur++;
        else{
          while(str[cur]==' ') cur++;
          while(str[cur]!=' '&&str[cur]!='-') cur++;
        }
      }
      else if("backward".equals(com[0])){
        if("char".equals(com[1])&&cur!=0) cur--;
        else{
          while(cur!=0&&str[cur-1]==' ') cur--;
          while(cur!=0&&str[cur-1]!=' ') cur--;
        }
      }
      else if("insert".equals(com[0])){
        if(com[1].length()>2){
          String insertionStr="                              ";
          for(int i=MAX-insertionStr.length();i>=cur;i--){
            str[i+insertionStr.length()]=str[i];
          }
          for(int i=0;i<insertionStr.length();i++){
            str[cur+i]=insertionStr.charAt(i);
          }
        }
      }
      else{
        if("char".equals(com[1])&&str[cur]!='-'){
          for(int i=cur;i<=MAX;i++){
            if(str[i]=='-') break;
            str[i]=str[i+1];
          }
        }
        else{
          int cnt=cur;
          boolean flag=false;
          while(str[cnt]==' ') cnt++;
          while(str[cnt]!=' '&&str[cnt]!='-'){
            cnt++;
            flag=true;
          }
          if(flag){
            for(int i=cnt;i<=MAX;i++){
            if(str[i-cnt+cur]=='-') break;
              str[i-cnt+cur]=str[i];
            }
          }
        }
      }
    }
    for(int i=0;;i++){
      if(i==cur) out.print("^");
      if(str[i]=='-') break;
      out.print(str[i]);
    }
    out.println();
  }
out.flush();
}
}