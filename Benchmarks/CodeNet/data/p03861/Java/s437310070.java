import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
      String[] t=sc.nextLine().split(" ");
 
//    String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();

//int n=Integer.parseInt(nyu);

//int A=Integer.parseInt(t[0]);
//int B=Integer.parseInt(t[1]);
long A=Long.parseLong(t[0]);
long B=Long.parseLong(t[1]);
long C=Long.parseLong(t[2]);

//boolean[][] data=new boolean[H][W];
long countA=0;

long countB=0;

countA=B/C;
countB=(A-1)/C;

System.out.println(countA-countB);
	}
}