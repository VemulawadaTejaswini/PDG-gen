import java.util.Scanner;

class Main
{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
		
	long M = 1;
	
	int m = scan.nextInt();
	int n = scan.nextInt();
		
	if(n%4!=0){
		for(int i=0; i<n%4; i++){
			M *= m;}
		n -= n % 4;}
			
	for(int i=0; i<n/4; i++){
		M *= m * m * m * m;
		if(M > 1000000007){
			M %= 1000000007;}
	}
	
	System.out.println(M);
	}
}
