import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[] sum = new int[5];
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) break;
			sum[0] = a+b;
			int max = sum[0];
			for(int i=1;i<5;i++){
				sum[i] = sc.nextInt() + sc.nextInt();
				max = Math.max(max, sum[i]);
			}
			for(int i=0;i<5;i++){
				if(sum[i]==max){
					System.out.println((char)(65+i) + " " + sum[i]);
					break;
				}
			}
		}
	}	
}