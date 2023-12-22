import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int b=0;
			int c=0;
			boolean flag=true;
			for(int j=0;j<10;j++){
				int a=sc.nextInt();
				if(a>b&&a>c){
					if(b>=c){
						b=a;
					}else{
						c=a;
					}
				}else if(a>b){
					b=a;
				}else if(a>c){
					c=a;
				}else{
					flag=false;
					break;
				}
			}
			if(flag){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}