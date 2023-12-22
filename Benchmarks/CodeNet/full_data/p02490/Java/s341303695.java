import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner newsKana = new Scanner(System.in);
		int x = 1, y = 1;
		x = Integer.valueOf(newsKana.next());
		y = Integer.valueOf(newsKana.next());
		while(x != 0 || y != 0){
			if(x > y){
				System.out.println(y + " " + x);
			}else{
				System.out.println(x + " " + y);
			}
			x = Integer.valueOf(newsKana.next());
			y = Integer.valueOf(newsKana.next());
		}
	}
}