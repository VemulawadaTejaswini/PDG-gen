import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,a,b,c;
		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			N=0;
			if(n==0 && x==0) break;
			else if(x<6){
				System.out.println("0");
			}else{
				if(n<=x){
					for(a=n;a>0;a--){
						for(b=a-1;b>0;b--){
							c = x - a - b;
							if(c>0 && b>c) N++; 
						}
					}
				}else{
					for(a=x-3;a>0;a--){
						for(b=a-1;b>0;b--){
							c = x - a - b;
							if(c>0 && b>c) N++; 
						}
					}					
				}
				System.out.printf("%d\n", N);
			}
		}
	}
}