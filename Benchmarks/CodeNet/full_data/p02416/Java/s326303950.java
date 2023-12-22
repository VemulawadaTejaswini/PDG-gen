import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String x;
		int total;
		while(true){
			x = sc.next();
			if (x.equals("0")){
				break;
			}
			total = 0;
			for (int i = 0; i < x.length(); i++){
				total += Integer.parseInt("" + x.charAt(i));
			}
			System.out.println(total);
		}
	}
}