import java.util.*;
import java.io.*;
import java.lang.*;
public class Main{
public static int gcd(int a,int b){
	if(b==0){return a;}
	return gcd(b,a%b);
}

public static void main(String[] args) throws FileNotFoundException, IOException{
       Scanner s=new Scanner(System.in);
       BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
       int n=Integer.parseInt(s.nextLine());
       String[][] arr=new String[n][2];
       for(int i=0;i<n;i++){
       	String[] tt=s.nextLine().split(" ");
       	arr[i]=tt;
       }
       String ss=s.nextLine();int k=-1;
       for(int i=0;i<n;i++){
       	if(arr[i][0].equals(ss)){k=i;break;}
       }
       int res=0;
       for(int i=k+1;i<n;i++){res+=Integer.parseInt(arr[i][1]);}
       
       
  out.write(res+" ");
        
        out.flush();
  }
}
