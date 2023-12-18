import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N%2==0){
			if(N<4){
				System.out.println("No");
			}
			for(int i = 0; i<=N/14;i++){
					if((N-14*i)%4==0){
						System.out.println("Yes");
						return;
					}
				}
		}else{
			if(N<7){
				System.out.println("No");
			}
			for(int i = 0;i <=N/11;i++){
				if((N-11*i)%7==0){
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}