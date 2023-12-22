import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int c1, c2, c3;
	static int[] number;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext()) return false;
		c1 = sc.nextInt(); c2 = sc.nextInt(); c3 = sc.nextInt();
		return true;
	}
	static void solve(){
		number = new int[11];
		for(int i = 0; i < 11; i++)
			number[i] = i;
		number[c1] = 0; number[c2] = 0; number[c3] = 0;
		int my_score = c1 + c2;
		int count = 0;
		if(my_score <= 10){
			System.out.println("YES");
		}else{
			int value = 20 - my_score;
			for(int i = 1; i <= 10; i++){
				if(value <= number[i])
					count++;
			}
			if(count < 4){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}