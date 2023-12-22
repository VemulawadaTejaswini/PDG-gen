import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws IOException{
		int H,W,i,j;
		Scanner sc=new Scanner(System.in);
		while(((W=sc.nextInt())!=0)&&((H=sc.nextInt())!=0)){
			for(j=0;j<W;j++){
				for(i=0;i<H;i++){
					System.out.print("#");
				}
				System.out.println();
			}
		}
	}
}