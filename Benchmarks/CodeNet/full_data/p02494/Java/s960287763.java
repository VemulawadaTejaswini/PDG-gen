import java.util.Scanner;
public class Main{
	private static Scanner sc;
	public static void main(String[] args){
		int i=999;
		int [] H=new int[i];
		int [] W=new int[i];
		for(i=0;i<999;i++){
			sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0||b==0){
				break;
			}
			if(a<1||b>300){
				break;
			}
			if(a<1||b>300){
				break;
			}
			H[i]=a;
			W[i]=b;
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