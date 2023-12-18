import java.util.Scanner;

public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int x,xmax=-100;
		int y,ymax=100;

		boolean safety = false;

		for (int i=0;i<n;++i){
			x=sc.nextInt();
			if(xmax<x)xmax=x;
		}
		for (int i=0;i<m;++i){
			y=sc.nextInt();
			if(ymax>y)ymax=y;
		}

		if (ymax>xmax){
			for(int z=xmax+1;z<=ymax&& safety==false;++z){
				if(X<z && z<=Y) safety=true;
			}
		}

		if (safety== true)System.out.println("No War");
		else System.out.println("War");

	}
}