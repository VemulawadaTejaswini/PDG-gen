import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());

		while(x != 0 && x != 0){

			if(x < y){
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
			
			x = Integer.parseInt(sc.next());
			y = Integer.parseInt(sc.next());
		}
	}
}