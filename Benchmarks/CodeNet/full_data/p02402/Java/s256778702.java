import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int num;
		int min, max, sum;
		min = max = sum = 0;
		
		for( int i = 0; i < n; i++  ) {
			
			num = scanner.nextInt();
			if(i == 0) {
    	    	min = num;
    	    	max = num;
    	    }
			if(min > num){
				min = num;
			}
			if(max < num){
				max = num;
			}
			sum += num;
		}	
		System.out.println(min+" "+max+" "+sum);
	}
}