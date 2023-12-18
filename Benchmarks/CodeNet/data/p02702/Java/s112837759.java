import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        int[] mod2019count = new int[2019];
        long count = 0;
        for(int i=0; i<len; i++) {
            int[] newModCount = new int[2019];
            int theDigit = Integer.parseInt(s.substring(i, i+1));
            for(int j=0; j<2019; j++) {
                int mod = (j*10 + theDigit) % 2019;
                newModCount[mod] = mod2019count[j];
            }
            int mod = theDigit % 2019;
            newModCount[mod]++;
            
            count += newModCount[0];
            mod2019count = newModCount;
        }
        System.out.println(count);
    }
}
