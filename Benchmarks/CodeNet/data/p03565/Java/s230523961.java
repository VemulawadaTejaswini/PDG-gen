import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] sArr = sc.next().toCharArray();
		int sLength = sArr.length;
		char[] tArr = sc.next().toCharArray();
		int tLength = tArr.length;
		for (int i = 0; i <= sLength - tLength; i++) {
		    boolean flag = true;
		    for (int j = 0; j < tLength; j++) {
		        if (sArr[sLength - j - i - 1] == '?' || sArr[sLength - j - i - 1] == tArr[tLength - j - 1] ) {
		            continue;
		        }
		        flag = false;
		        break;
		    }
		    if (!flag) {
		        continue;
		    }
		    for (int j = 0; j < tLength; j++) {
		        sArr[sLength - j - i - 1] = tArr[tLength - j - 1];
		    }
		    for (int j = 0; j < sLength; j++) {
		        if (sArr[i] == '?') {
		            sArr[i] = 'a';
		        }
		    }
		    System.out.println(sArr);
		    return;
		}
       System.out.println("UNRESTORABLE");
	}
}
