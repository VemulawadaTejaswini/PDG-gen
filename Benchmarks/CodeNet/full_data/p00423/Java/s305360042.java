import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int ap = 0, bp = 0;
		
		for(int ac, bc, i = 0; i < n; i++){
			ac = sca.nextInt();
			bc = sca.nextInt();
			
			if(ac > bc){
				ap += ac + bc;
			}else if(ac < bc){
				bp += ac + bc;
			}else{
				ap += ac;
				bp += bc;
			}
		}
		
		System.out.println(ap + " " + bp);
	}
}