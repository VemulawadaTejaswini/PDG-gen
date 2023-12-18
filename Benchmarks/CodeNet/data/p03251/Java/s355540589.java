import java.util.*;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int m=sc.nextInt();
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int x[]=new int[n];
		int y[]=new int[m];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			y[i]=sc.nextInt();
		}
		int max=0;
		int min=10000;
		for(int i=0;i<n;i++){
			if(max<x[i]){
				max=x[i];
			}
		}
		for(int i=0;i<m;i++){
			if(min>y[i]){
				min=y[i];
			}
		}

		boolean ans=false;

		if(max+1<=min){
			for(int i=max;i<=min;i++){
				if(X<i && Y>=i){
					ans=true;
				}
			}
		}else{
			ans=false;
		}

		if(ans==true){
			System.out.println("No War");
		}else{
			System.out.println("War");
		}

	}
}
