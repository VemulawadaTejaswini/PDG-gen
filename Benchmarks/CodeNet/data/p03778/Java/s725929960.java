import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  // String nyuA=sc.nextLine();
  // String nyuB=sc.nextLine();
 
     String[] S=sc.nextLine().split(" ");

//int n=Integer.parseInt(nyuA);

int W=Integer.parseInt(S[0]);
int a=Integer.parseInt(S[1]);
int b=Integer.parseInt(S[2]);


//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);
if(Math.abs(a-b)>W){
System.out.println(Math.abs(a-b)-W);
}else{
System.out.println(0);
}


	}
}