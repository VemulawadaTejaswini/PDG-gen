import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//H*Wの＃のフレームを持つ四角形を作成。中身は"."
		Scanner sc=new Scanner(System.in);
		while(true){
			int H=sc.nextInt();
			int W=sc.nextInt();
			if(H==0 && W==0){
				break;
			}
			for(int i=1;i<=H;i++){
				for(int j=1;j<=W;j++){
					if(1<i && i<H && 1<j && j<W){
						System.out.print(".");
					}else{
						System.out.print("#");
					}
					if(j==W){
						System.out.println();
					}
				}
				if(i==H){
					System.out.println();
				}
			}
		}
	}

}

