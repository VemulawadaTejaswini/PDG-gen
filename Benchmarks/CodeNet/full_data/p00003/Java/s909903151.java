import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			if(x>y&&x>z){
				if(x*x==y*y+z*z){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else if(y>x&&y>z){
				if(y*y==x*x+z*z){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else if(z>x&&z>y){
				if(z*z==x*x+y*y){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
			}else{
				System.out.println("NO");
			}
		}
	}
}