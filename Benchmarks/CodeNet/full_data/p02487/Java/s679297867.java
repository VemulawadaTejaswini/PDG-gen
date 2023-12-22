import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int H=1,W=1;
		while(true){
			H = s.nextInt();
			W = s.nextInt();
			if(H==0&&W==0){
				break;
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(j==0||j==W-1||i==0||i==H-1){
						System.out.print("#");
					}
					else{
						System.out.print(".");
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}