import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0&&W==0){
				break;
			}
			if(H<1||H>300){
				break;
			}
			if(W<1||W>300){
				break;
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
			    	System.out.print("#");
			    }
				System.out.println();
			}
			System.out.println();
		}
	}
}