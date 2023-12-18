

import java.util.*;

public class Main {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sx=sc.nextInt();
		int sy=sc.nextInt();
		int tx=sc.nextInt();
		int ty=sc.nextInt();
		int i;
		for(i=0;i<ty;i++) System.out.print("U");
		for(i=0;i<tx;i++) System.out.print("R");
		for(i=0;i<ty;i++) System.out.print("D");
		for(i=0;i<tx;i++) System.out.print("L");
		
		System.out.print("L");
		for(i=0;i<=ty;i++) System.out.print("U");
		for(i=0;i<=tx;i++) System.out.print("R");
		System.out.print("D");
		
		System.out.print("R");
		for(i=0;i<=ty;i++) System.out.print("D");
		for(i=0;i<=tx;i++) System.out.print("L");
		System.out.print("U");


		
	}

}
