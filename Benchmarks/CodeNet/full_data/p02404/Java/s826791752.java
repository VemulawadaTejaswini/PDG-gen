import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0&&W==0)break;
			for(int i=0;i<H;i++){
			for(int t=0;t<W;t++){	
			if(i==0||t==0||i==H-1||t==W-1){
			System.out.print("#");
				}else{
				System.out.print(".");
				}
			}
				System.out.println("");
			}
		}
	}
}

