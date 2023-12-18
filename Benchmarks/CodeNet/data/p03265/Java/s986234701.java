import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


String[] S=sc.nextLine().split(" ");
int a=Integer.parseInt(S[0]);
int b=Integer.parseInt(S[1]);
int c=Integer.parseInt(S[2]);
int d=Integer.parseInt(S[3]);

int x=c-a,y=d-b;
System.out.println((c-y)+""+(d+x)+""+(a-y)+""+(b+x));
}
}



