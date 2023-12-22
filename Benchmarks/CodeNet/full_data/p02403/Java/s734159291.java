import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		
		int i=0;
		int j=0;
		int k=0;
		int n=0;
		Scanner scan;
		int H[]=new int[1000];
		int W[]=new int[1000];
		
		while(true){
			scan = new Scanner(System.in);
			H[n]=scan.nextInt();
			W[n]=scan.nextInt();
			
			if(H[n]==0&&W[n]==0){
				break;
			}
			n++;
		}
		
		System.out.println("test");
		
		for(i=0;i<n;i++){
			for(j=0;j<H[i];j++){
				for(k=0;k<W[i];k++){
					System.out.print("#");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
		
	}
}