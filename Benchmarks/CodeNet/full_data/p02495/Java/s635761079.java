import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(;;){
			int H = sc.nextInt();
			int W = sc.nextInt();
			if(H==0 && W==0) break;
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(i%2==0){
						if(j%2==0){
						System.out.print("#");
						}
						else{
							System.out.print(".");
						}
					}
					if(i%2==1){
						if(j%2==0){
							System.out.print(".");
							}
							else{
								System.out.print("#");
							}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}	
	}
}