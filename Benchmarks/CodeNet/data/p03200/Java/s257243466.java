import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		int num = st.length();
		boolean isBlack[] = new boolean[st.length()];
		for(int i = 0; i < num; i ++) {
			isBlack[i] = st.charAt(num - i - 1) == 'B';
		}
		int count = 0;
		for(int i = 0; i < num - 1; ) {
			if(!isBlack[i] && isBlack[i + 1]) {
				isBlack[i] = !isBlack[i];
				isBlack[i + 1] = !isBlack[i + 1];
				count ++;
				i --;
			}else {
				i ++;
			}
			i = Math.max(0, i);
		}
		System.out.println(count);
	}
}