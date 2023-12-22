import java.util.Scanner;

public class fx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int n = Integer.parseInt(s);

		int min = Integer.parseInt(s);
		int max_margin = Integer.MIN_VALUE;
		for(int i = 1; i < n; i++){
			String str = scan.next();
			int now = Integer.parseInt(str);
			int margin = now - min;
			
			if(margin > max_margin){
				max_margin = margin;
			}
			if(now < min){
				min = now;
			}
		}
		System.out.println(max_margin);
	}

}