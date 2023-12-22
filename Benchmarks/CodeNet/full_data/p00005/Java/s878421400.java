public class Lesson1_2 {
	public static void main(String args[]){
		int x;
		int y;
		System.out.println("2 number input...");
		x = new java.util.Scanner(System.in).nextInt();
		y = new java.util.Scanner(System.in).nextInt();
		final int OVER = 2000000000;
		int end = 0;
		int ov = 0;
		if(x < y){
			ov = y;
		}else{
			ov = x;
		}
		for(int n = 1; n < ov; n++){
			if((x <= ov)&&(y <= ov)){
				if((x%n == 0)&&(y%n == 0)){
					end = n;
				}
			}
		}
		int smoll = 0;
		for(int n = ov; n < OVER; n++){
			if((x <= OVER)&&(y <= OVER)){
				if((n%x == 0)&&(n%y == 0)){
					smoll = n;
					break;
				}
			}
		}
		System.out.println(end + " " + smoll);
	}
}