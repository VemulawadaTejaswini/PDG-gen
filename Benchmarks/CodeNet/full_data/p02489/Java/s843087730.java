public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = 1;
		int i = 1;
		while(x != 0){
			x = scan.nextInt();
			if(x == 0) {
				break;
			}
			System.out.println("Case " + i +": " + x);
			i++;
		}
	}

}