import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H;
		int W;
		do {
			H=sc.nextInt();
			W=sc.nextInt();	
			for(int i=0;i<H;i++) {
				for(int t=0;t<W;t++) {
					if(i==0||i==H-1||t==0||t==W-1){
						System.out.print("#");
					}else {
						System.out.print(".");
					}
				}
				System.out.println("");
			}
		}while(!(H==0&&W==0));
	}
}

