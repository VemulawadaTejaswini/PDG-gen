import java.util.Scanner;

public class Main {
	static long X, Y;
	static long binary_search() {
		long left=2;
		long right=Y;
		while(left<right) {
			long mid=(left+right)/2;
			if(X*Math.pow(2, mid-1)==Y) {
				return mid;
			}
			else if(X*Math.pow(2, mid-1)>Y) {
				right=mid;
			}
			else {
				left=mid+1;
			}
		}
		return left-1;
	}
	
	public static void main(String[] args){
		try(Scanner sc=new Scanner(System.in)){
			X=sc.nextLong();
			Y=sc.nextLong();
			System.out.println(binary_search());
			
		}
	}	
}