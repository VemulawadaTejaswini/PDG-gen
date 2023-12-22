public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		while(true){
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x == 0 && y == 0){
				break;
			}else if(x < y ){
				System.out.println(x + " " + y);
			}else{
				System.out.println(y + " " + x);

			}
			break;
		}

	}

}