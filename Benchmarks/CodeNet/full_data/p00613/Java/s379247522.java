import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int k = cin.nextInt();
			if(k==0){
				break;
			}
			else if(k==2){
				int tmp = cin.nextInt();
				System.out.println(tmp);
				continue;
			}
			int[] a = new int[(k*(k-1))/2];
			int sum = 0;
			for(int i = 0; i < a.length; i++){
				int tmp = cin.nextInt();
				sum+= tmp; 
				//a[i] = cin.nextInt();
			}
			System.out.println(sum/(k-1));
			
		}
	}

}