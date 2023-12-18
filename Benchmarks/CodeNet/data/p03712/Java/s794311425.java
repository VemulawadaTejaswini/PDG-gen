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

int H=Integer.parseInt(O[0]);
int W=Integer.parseInt(O[1]);

String[] line=new String[H];

for(int i=0;i<H;i++){
line[i]=sc.nextLine();
}

for(int i=0;i<W+2;i++)
System.out.print("#");

System.out.println();

for(int i=0;i<H;i++){
System.out.print("#");
System.out.print(line[i]);
System.out.println("#");
}

for(int i=0;i<W+2;i++)
System.out.print("#");

System.out.println();


//long H=Long.parseLong(t[0]);
//long W=Long.parseLong(t[1]);
//long C=Long.parseLong(t[2]);


	}
}