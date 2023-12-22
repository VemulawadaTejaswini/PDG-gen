import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] p = new int[5];
		int min = 4000;

		Scanner sc = new Scanner(System.in);		
		for(int i = 0; i< 5;i++){
			p[i] = sc.nextInt();
		}
		for(int i = 0;i <3 ;i++){
			int sum = 0;
			for(int k=3;k<5;k++){
				sum = p[i]+p[k]-50;
				if(min > sum){
					min = sum;
				}
			}
		}
		System.out.println(min);
	}

}