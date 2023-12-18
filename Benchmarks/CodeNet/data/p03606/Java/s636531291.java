import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
//    String[] s=sc.nextLine().split("");
//     String[] e=sc.nextLine().split(" ");

int n=Integer.parseInt(nyuA);

//int A=Integer.parseInt(s[0]);
//int B=Integer.parseInt(s[1]);
boolean[] list=new boolean[100005];
for(int i=0;i<n;i++){
String[] s=sc.nextLine().split(" ");
int be=Integer.parseInt(s[0]);
int ed=Integer.parseInt(s[1]);
for(int j=be;j<=ed;j++)list[j]=true;
}
int res=0;
for(int i=0;i<list.length;i++){
if(list[i])res++;
}

System.out.println(res);

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}