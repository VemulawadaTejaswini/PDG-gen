import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int H = sc.nextInt(), W = sc.nextInt() , D = sc.nextInt();
			if(H == 0 && W == 0 && D == 0){
				break;
			}
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++){
				int r = sc.nextInt();
				
				boolean OK = false;
				for(int[] dim : new int[][] {{H,W},{H,D},{W,D}}){
					if((r*r*4) > (dim[0]*dim[0] + dim[1]*dim[1])){
						OK = true;
						break;
					}
				}
				
				if(OK){
					System.out.println("OK");
				}else{
					System.out.println("NA");
				}
			}
		}
		
	}
}