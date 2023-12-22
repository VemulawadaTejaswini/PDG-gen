import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Integer i,j,max=0,n = sc.nextInt(),res = Integer.MIN_VALUE;
		int [] price = new int [n];

		for(i=0;i<n;i++){
			price[i] = sc.nextInt();
		}
		for(i=0;i<n-1;i++){
			max = 1;
			for(j=i+1;j<n;j++){
				if(max < price[j]) max = price[j];
			}
			res = Math.max(res, max-price[i]);
		}
		System.out.println(res);
	}

}
