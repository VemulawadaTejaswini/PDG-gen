import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
		int H = sc.nextInt();
		int W= sc.nextInt();
		if (H == 0 && W == 0) {
		break;
		}
      if(H<=300&&H>=1&&W<=300&&W>=1){
			for(int i=0;i<H;i++){
				if(i%2==0){
				for(int j=0;j<W;j++){
					if(j%2==0){
					System.out.printf("#");
				}else{
			        System.out.printf(".");
				}
				}
				}
					if(i%2!=0){
					for(int k=0;k<W;k++){
						if(k%2==0){
						System.out.printf(".");
					}else{
				        System.out.printf("#");
					}
					}
					}
				System.out.printf("\n");
			}
		}
		}	
	}
	}