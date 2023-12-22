public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		int i = 1;
		while(i != 0){
			while(x != 0){
				System.out.println("Case " + i +": " + x);
				x++;
				break;
			}
			i++;
			break;

		}
	}

}