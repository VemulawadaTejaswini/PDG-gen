import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		int i=999;
		int [] a=new int[i];
		int [] H=a;
		int [] b=new int[i];
		int [] W=b;
		for(i=0;i<999;i++){
			sc = new Scanner(System.in);
			H[i]=sc.nextInt();
			W[i]=sc.nextInt();
			if(H[i]==0||W[i]==0){
				break;
			}
		}
		for(int n=0;n<=i;n++){
			for(int p=0;p<H[n];p++){
				for(int q=0;q<W[n];q++){
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}