import java.util.Scanner;

class Main{
	
	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		String str = sc.next();
		
		for(i=0;i<n-1;i++){
			if((str.charAt(i) =='x') && (str.charAt(i+1) =='x'))break;
		}
		System.out.println(i+1);
	}	
}