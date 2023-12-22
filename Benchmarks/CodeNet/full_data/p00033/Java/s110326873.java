import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int b=0;
			int c=0;
			int j=0;
			for(j=0;j<10;j++){
				int a=sc.nextInt();
				if(a>b){
					b=a;
				}else if(a>c){
					c=a;
				}else{
					System.out.println("NO");
					break;
				}
				if(j==9){
					System.out.println("YES");
				}
			}
		}
	}
}