import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int H,W;
		while(true){
			H=scan.nextInt();
			W=scan.nextInt();
			if(H==0&&W==0) break;
			
			for(int i=0;i<W;i++){
				for(int j=0;j<H;j++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
}