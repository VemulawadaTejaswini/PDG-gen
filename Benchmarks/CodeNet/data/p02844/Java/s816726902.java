
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        String S = scan.next();

        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i <= 999; i++) {
            if(i < 10) {
                int zeroTimes = 0;
                for(int j = 0; j < S.length(); j++) {
                    if(zeroTimes < 2) {
                        if (S.charAt(j) == '0')
                            zeroTimes++;
                    } else {
                        if(S.charAt(j) == String.valueOf(i).charAt(0)) {
                            set.add(i);
                            break;
                        }
                    }
                }
            } else if(i < 100) {
                int times = 0;
                for(int j = 0; j < S.length(); j++) {
                    if(times == 0) {
                        if (S.charAt(j) == '0')
                            times++;
                    } else if(times == 1){
                        if(S.charAt(j) == String.valueOf((int)Math.floor(i/10.0)).charAt(0)) {
                            times++;
                        }
                    } else if(times == 2) {
                        if (S.charAt(j) == String.valueOf(i % 10).charAt(0)) {
                            set.add(i);
                            break;
                        }
                    }
                }
            } else {
                int times = 0;
                int a = (int)Math.floor(i/100.0);
                int b = (int)Math.floor((i - 100*a)/10.0);
                int c = (int)i%10;
                for(int j = 0; j < S.length(); j++) {
                    if(times == 0) {
                        if (S.charAt(j) == String.valueOf(a).charAt(0))
                            times++;
                    } else if(times == 1){
                        if(S.charAt(j) == String.valueOf(b).charAt(0)) {
                            times++;
                        }
                    } else if(times == 2) {
                        if (S.charAt(j) == String.valueOf(c).charAt(0)) {
                            set.add(i);
                            break;
                        }
                    }
                }
            }
        }
        os.println(set.size());
    }


}