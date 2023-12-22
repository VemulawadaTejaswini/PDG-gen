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
					for(int n=0;n<W-1;n++){
						System.out.print("#");
						if(n==W-2){
							System.out.println("#");
						}
					}	
				for(int v=0;v<H-2;v++){
				   for(int m=0;m<W-2;m++){
					  if(m==0){
						  System.out.print("#");
					  }
				   System.out.print(".");
					  if(m==W-3){
						  System.out.println("#");
					  }
				   }
			     }
				for(int n=0;n<W-1;n++){
					System.out.print("#");
					if(n==W-2){
						System.out.println("#");
						System.out.println("");
					}
	            }
			}
	}
}