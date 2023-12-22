import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=0;i<N;i++){
			int a=0,b=0,c=0;
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x>y){
				int t=x;
				x=y;
				y=t;
			}
			int z=sc.nextInt();
			if(z<x){
				a=z;
				b=x;
				c=y;
			}else if(z<y){
				a=x;
				b=z;
				c=y;
			}else{
				a=x;
				b=y;
				c=z;
			}
			if(a*a+b*b==c*c){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}