import java.util.Scanner;
public class Chess{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0&&W==0){
				break;
			}else{
				for(int i=0;i<H;i++){
					for(int j=0;j<W;j++){
						if((j+i)%2==0){
							System.out.printf("#");
						}else{
							System.out.printf(".");
						}
					}
					System.out.println("");
					System.out.println("");
				}
			}
		}
	}
}