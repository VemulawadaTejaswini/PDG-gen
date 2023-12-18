import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans[] = {"Sunny", "Cloudy", "Rainy"};
		sc.close();
		int an = 0;
		for(int i = 0; i < 3; ++i){
			if(s.equals(ans[i])){
				an = i + 1;
				an %= 3;
				break;
			}
		}
		System.out.println(ans[an]);
	}
}
