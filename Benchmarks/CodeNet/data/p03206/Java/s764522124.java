
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
   //   String[] nyu=sc.nextLine().split(" ");

     String nyu=sc.nextLine();
//int[] num=new int[6];
//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);
int C=Integer.parseInt(nyu);
//double A=Double.parseDouble(nyu[0]);
//double B=Double.parseDouble(nyu[1]);

switch(C){
case 25:
System.out.println("Christmas") ;
break;
case 24:
System.out.println("Christmas Eve") ;
break;
case 23:
System.out.println("Christmas Eve Eve") ;
break;
case 22:
System.out.println("Christmas Eve Eve Eve") ;
break;
}


	}
}