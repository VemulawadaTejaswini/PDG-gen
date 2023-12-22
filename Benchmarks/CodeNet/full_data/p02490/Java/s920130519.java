import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		x=sc.nextInt();
		y=sc.nextInt();
		while(x!=0 && y!=0){
			if(x>=y){
				System.out.println(y+" "+x);
			}else if(y>=x){
				System.out.println(x+" "+y);
			}
			x=sc.nextInt();
			y=sc.nextInt();
		}
		// TODO Auto-generated method stub

	}

}