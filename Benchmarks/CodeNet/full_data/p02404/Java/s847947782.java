import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			int H=sc.nextInt();
			int W=sc.nextInt();
			
			if(H==0&&W==0) {
				break;
			}
			
			for(int t=0;t<W;t++) {
				System.out.print("#");
			}
			System.out.println();//一行目
			
			for(int a=0;a<H-2;a++) {
				System.out.print("#");
				for(int b=0;b<W-2;b++) {
						System.out.print(".");
				}
				System.out.print("#");
				System.out.println();
			}//２～（H-1）行目
			
			for(int n=0;n<W;n++) {
				System.out.print("#");
			}
			System.out.println();//H行目
			
			System.out.println();//次のフレームとの間に１行開けるため。
			
		}
	}
	
}

