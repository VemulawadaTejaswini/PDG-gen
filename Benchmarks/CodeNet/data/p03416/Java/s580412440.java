import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		
		for(int i=a ; i<=b ; i++) {
			if( check(String.valueOf(i)) ) {
				cnt++;
			}
		}
		System.out.print(cnt);
	}

	public static boolean check(String sen) {
        int minIdx = 0;
        int maxIdx = sen.length() - 1;
 
        while(minIdx < maxIdx) {
            if(sen.charAt(minIdx++) != sen.charAt(maxIdx--)) {
                return false;
            }
        }
        return true;
    }
}
