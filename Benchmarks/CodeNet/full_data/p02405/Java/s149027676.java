import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0 && W==0){
				break;
			}
			for(int i=1;i<=H;i++){
				for(int j=1;j<=W;j++){
					if(i%2==1){
						if(j%2==1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}else{
						if(j%2==1){
							System.out.print(".");
						}else{
							System.out.print("#");
						}
					}
					if(j==W){
						System.out.println();
					}
				}
				if(i==H){
					System.out.println();
				}
			}
		}
	}

}

