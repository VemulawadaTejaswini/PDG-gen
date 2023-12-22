import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int a,b,W,H;
		Scanner br=new Scanner(System.in);
		H=br.nextInt();
		W=br.nextInt();
		if(H==0 && W==0){
			System.out.println();
			System.exit(0);
		}else{
			for(a=1;a<=H;a++){
				for(b=1;b<=W;b++){
					System.out.print("#");
					}
				System.out.println();
				}
			System.out.println();
			}
		}
}