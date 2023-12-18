import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String S =sc.next();
    String s[] =S.split("",0);
    int N =S.length();
    int t[] =new int[N];
    int x=0;int y=0;
    for(int i=0;i<N;i++){
      t[i]=Integer.parseInt(s[i]);
      if(t[i]==0){x=x+1;}
      else{y=y+1;}
    }
    int z =Math.min(x,y);
    System.out.println(z*2);
  }
}