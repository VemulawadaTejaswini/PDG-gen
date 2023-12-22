import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        int[] digits = new int[str.length + 1];
        for (int i = 0; i < str.length; i++) {
            digits[i + 1] = Character.getNumericValue(str[i]);
        }
        int[] residueDP = new int[2019];
        // store number of SUFFIXES with a given residue.
        // We can definitely enumerate all N of those, and we leverage
        // the fact that we can SUBTRACT suffixes in a way that
        // allows us to generate all valid substrings! This will be called
        // the substring from suffix trick!
        residueDP[0] = 1; // we can always build on top of the empty suffix!
        // Now we create a running suffix
        int suffix = 0;
        int shift = 1;
        long ans = 0;
        for (int pos = str.length; pos >= 1; pos--) {
            suffix = (suffix + shift * digits[pos]) % 2019;
            ans += residueDP[suffix]; // build off ALL old ones, subtracting to get 0!
            residueDP[suffix]++; // update it!
            shift = (shift * 10) % 2019;
        }
		System.out.println(ans);
	}
}
