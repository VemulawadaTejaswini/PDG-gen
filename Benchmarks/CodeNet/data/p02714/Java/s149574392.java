
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            String s = scanner.next();
            int ans = 0;
            for(int i = 0 ; i < s.length() - 2; ++i){
                for(int j = i+1 ; j < s.length() - 1; ++j){
                    for(int k = j+1; k < s.length(); ++k){
                        if(s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k) && j - i != k - j)
                                ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

