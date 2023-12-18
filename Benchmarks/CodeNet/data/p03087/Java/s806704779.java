import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		sc.next();
		int q = Integer.parseInt(sc.next());
		String s = sc.next(), str = "";
		int[] lr = new int[q * 2];
		Arrays.setAll(lr, i -> Integer.parseInt(sc.next()));
		for(int i=0, count = 0; i<q*2; i+=2, count=0){
			str = s.substring(lr[i]-1, lr[i+1]);
			for(; str.contains("AC"); count++){
				str = str.replaceFirst("AC", "");
			}
			System.out.println(count);
		}
	}
}
