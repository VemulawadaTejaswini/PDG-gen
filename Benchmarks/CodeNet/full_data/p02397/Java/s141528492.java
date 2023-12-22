public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		while((x != 0) || (y != 0)){
			if(x <= y){
				System.out.println(x + " " + y);
			}else if(x > y){
				System.out.println(y + " " + x);
			}
			break;
		}
	}

}