import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String W=scan.next(),T;
		int count = 0;
		
		while(true){
			T = scan.next();
			if(T.equals("END_OF_TEXT")){
				break;
			}
			if(W.toLowerCase().equals(T.toLowerCase())){
				count++;
			}
		}
		
		System.out.println(count);
	}
}