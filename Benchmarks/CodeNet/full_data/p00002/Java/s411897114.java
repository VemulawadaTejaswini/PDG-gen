import java.util.Scanner;

class Main{	
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n = a+b;
			
			String st = String.valueOf(n);
			
			
			System.out.println(st.length());
			
		}
		
	}
}