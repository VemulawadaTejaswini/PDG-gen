import java.util.Scanner;

/**
 * @author kawakami
 *
*/ 
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int H,W;
		
		
		
		while(true){
			H = as.nextInt();
			W = as.nextInt();
			
			if(H==0 && W==0){
				break;
			}
			
			for(int i=0;i<H;i++){
				
				for(int j=0;j<W;j++){
					System.out.print("#");
				}
				
				System.out.println();
				
			}
			
			System.out.println(" ");
		}
		
		

	}

}