import java.lang.*;
import java.util.*;
public class Main{
public static void main(String[] args) 
{
	Scanner scanner=new Scanner(System.in);
	int x1=scanner.nextInt();
	int y1=scanner.nextInt();
	int x2=scanner.nextInt();
	int y2=scanner.nextInt();
	int t=x2-x1;
	int d=y2-y1;
	for(int i=0;i<d;i++)
		System.out.print("U");
	for(int i=0;i<t;i++)
		System.out.print("R");
	for(int i=0;i<d;i++)
		System.out.print("D");
	for(int i=0;i<t;i++)
		System.out.print("L");
	System.out.print("L");
	for(int i=0;i<d+1;i++)
		System.out.print("U");
	for(int i=0;i<t+1;i++)
		System.out.print("R");
	System.out.print("DR");
	for(int i=0;i<d+1;i++)
		System.out.print("D");
	for(int i=0;i<t+1;i++)
		System.out.print("L");
	System.out.print("U");

}	
}
