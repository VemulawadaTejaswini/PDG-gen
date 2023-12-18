import java.util.Scanner;

class Main {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = s.length();
		int x[] = new int[n];
		for(int i = 0;i < n; i++)
			x[i] = s.charAt(i)-'0';
		
		String X ="";
		
		for(int i = 0; i < Math.pow(2,n-1); i++){
			for(int j = 0; j < n-1; j++){
				
				X += String.valueOf(x[j]);
				if((1 & (i>>j)) == 1){
					X += "X";
				}
			}

			X += String.valueOf(x[n-1]);
			if(i != Math.pow(2,n-1)-1)X += "X";
		}
		String[] sprit = X.split("X", 0);
		long sum = 0;
		for(int i = 0; i < sprit.length; i++)
			sum += Long.valueOf(sprit[i]);
		System.out.println(sum);
	}
}