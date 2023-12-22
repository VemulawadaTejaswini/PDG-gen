import java.util.Scanner;

 class Main {
	static Integer[] F = new Integer[44];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(fibonacci(scanner.nextInt()));
	}
	
	static int fibonacci(int n) {
		int a[]=new int[n+1];
	    a[0]=1;
	    a[1]=1;
	    if(n<2){
	        return a[n];
	    }
	    for(int i=2;i<=n;i++){
	        a[i]=a[i-1]+a[i-2];
	    }
	            return a[n];
	    }
}