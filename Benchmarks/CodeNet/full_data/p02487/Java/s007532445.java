import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0&&b==0){
				break;
			}else{
				for(int i=1;i<=a;i++){
					if(i==1||i==a){
						for(int j=1;j<=b;j++){
							System.out.printf("#");
						}
						System.out.printf("\n");
					}else{
						System.out.printf("#");
						for(int j=2;j<b;j++){
							System.out.printf(".");
						}
						System.out.printf("#\n");
					}
				}
				System.out.printf("\n");
			}
		}
	}
}