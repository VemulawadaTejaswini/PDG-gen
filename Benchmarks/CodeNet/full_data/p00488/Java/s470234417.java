import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] mo = new int [5];
		int min=2001;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < mo.length; i++){
			mo[i]=sc.nextInt();
		}
		for(int m = 0; m < 3; m++){
			for(int n = 3; n < 5; n++){
				sum = (mo[m]+mo[n])-50;
				if(min>sum){
					min = sum;
				}
			}
		}
		System.out.println(min);
		// TODO Auto-generated method stub

	}

}