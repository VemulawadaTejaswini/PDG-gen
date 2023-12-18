import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.equals("A")){
			System.out.println("T");
		}else if(str.equals("T")){
			System.out.println("A");
		}else if(str.equals("C")){
			System.out.println("G");
		}else{
			System.out.println("C");
		}
	}
}