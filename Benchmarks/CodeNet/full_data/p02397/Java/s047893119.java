public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if(x <= y && (x != 0 || y != 0)){
			System.out.println(x + " " + y);
		}else if(x > y){
			System.out.println(y + " " + x);
		}
		while(x == 0 && y == 0)
			break;
	}

}