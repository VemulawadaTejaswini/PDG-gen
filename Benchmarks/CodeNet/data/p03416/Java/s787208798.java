import java.util.Scanner;
public class Main {
		 
			public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
				int n = sc.nextInt(),m= sc.nextInt();
				int sum=0;
				for(int i=n; i<=m; i++) {
					int a1=i%10,a2=i/10000%10; 
					int a3=i/10%10,a4=i/1000%10;
					if(a1==a2 && a3==a4) {
						sum++;
					}
				}
				System.out.println("sum");
			}
		 
		}