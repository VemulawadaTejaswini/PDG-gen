import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * <br>ÛèCÌvO
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max=0,sum=0,	//ÅåÅ10Ì10æBint^ÅåävH
			n,k;
		int[] list;
		while(true){
			n = scan.nextInt();		//¢
			k = scan.nextInt();
			if(n==0 && k==0){
				break;
			}
			
			list = new int[n];
			for(int i=0; i<n; i++) list[i] = scan.nextInt();
			for(int i=0; i<n-k+1; i++){
				for(int j=i; j<i+k; j++){
					sum += list[j];
				}
				if(max<sum){
					max=sum;
				}
				sum=0;
			}
			
			System.out.println(max);
		}
	}
}