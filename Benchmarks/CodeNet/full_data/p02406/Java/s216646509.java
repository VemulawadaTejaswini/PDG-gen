public class Main {
	public static void main(String[] args){
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int x = scan.nextInt();
		for(int i = 1;i <= x; i++){
			if(i % 3 == 0){
				System.out.println(" "+i);
			}else if(i % 10 == 3){
				System.out.println(" "+i);
			}
		}
	}

}