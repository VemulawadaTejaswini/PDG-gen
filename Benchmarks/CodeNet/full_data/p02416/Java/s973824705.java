import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		for(;;){
			int x = scan.nextInt();
			if(x == 0){
				break;
			}
			String number = String.valueOf(x);
			int sum = 0;
			for(int i = 0; i < number.length(); i++){
				char ch = number.charAt(i);
				String c = String.valueOf(ch);
				int n = Integer.parseInt(c);
				sum += n;
			}
			list.add(sum);
		}

		for(int n : list){
			System.out.println(n);
		}
	}
}