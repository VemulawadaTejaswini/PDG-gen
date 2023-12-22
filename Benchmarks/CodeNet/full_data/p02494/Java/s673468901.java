import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
			while(true){
				int H,W;
				H=cin.nextInt();
				W=cin.nextInt();
				if(H==0 && W==0){
					break;
				}
				for(int n=0;n<W;++n){
					for(int i=0;i<H;++i){
						if(i!=H-1)System.out.print("#");
						else{System.out.println("#");
						}
					}
				}
			}
			
	}
}