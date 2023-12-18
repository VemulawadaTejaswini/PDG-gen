import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

//   String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
     String[] O=sc.nextLine().split(" ");
   //  String[] E=sc.nextLine().split("");

//int n=Integer.parseInt(nyuA);

int N=Integer.parseInt(O[0]);
int M=Integer.parseInt(O[1]);

int[] num=new int[N];

for(int i=0;i<M;i++){
O=sc.nextLine().split(" ");
int A=Integer.parseInt(O[0]);
int B=Integer.parseInt(O[1]);
num[A-1]++;num[B-1]++;
}

for(int i=0;i<N;i++)
System.out.println(num[i]);

//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}