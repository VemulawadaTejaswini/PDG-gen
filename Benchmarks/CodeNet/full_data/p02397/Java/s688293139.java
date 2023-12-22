public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x < y){
			System.out.println(x + " " + y);
		}else{
			System.out.println(y + " " + x);
		}

	}

}