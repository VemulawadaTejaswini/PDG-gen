import java.util.Scanner;

class Main{
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		
				while(in.hasNext()){
				int a = in.nextInt();
				int b = in.nextInt();
				int c = a + b;
				String str = Integer.toString(c);
				System.out.println(str.length());
	
		}
	}
}