import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int i,j;
		Scanner sc = new Scanner(System.in);
		while(true){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H==0 && W == 0){
				break;
			}else if(H==1){
				for(j=1;j<=W;j++){
					System.out.print("#");
				}
				System.out.println();
				System.out.println();
			}else{
				for(j=1;j<=W;j++){
					System.out.print("#");
				}
				System.out.println();
				for(i=2;i<=H-1;i++){
					System.out.print("#");
					for(j=2;j<=W-1;j++){
						System.out.print(".");
					}
					System.out.println("#");
				}
				for(j=1;j<=W;j++){
					System.out.print("#");
				}
				System.out.println();
				System.out.println();
			}	
		}
	}
}