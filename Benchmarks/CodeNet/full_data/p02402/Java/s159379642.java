import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		
		int min;
		int max;
		
		

		int i = 0;
		
        int[] data = { a, b, c, d, e};
        min = data[0];
        max = data[0];

        for(i=0;i<n;i++){
        	min = Math.min(min,data[i]);
        	max = Math.max(max,data[i]);
        	
        }

        
		int sum = a+b+c+d+e;


		System.out.print(min+ " " +max+ " " +sum);
		}
	
}
