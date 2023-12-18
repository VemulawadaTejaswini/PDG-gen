import java.util.*;

class Main{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		long count=0;
		
		for(int n=num;n>0;n--){
			if(num%n==0){
				count += (9 * (Math.pow(10,n-1)) - (num-num/n));
				count %=(Math.pow(10,9) + 7);
			}
			else{
				count++;
			}
		}
		System.out.println((int)(count % (Math.pow(10,9) + 7)));
	}
}