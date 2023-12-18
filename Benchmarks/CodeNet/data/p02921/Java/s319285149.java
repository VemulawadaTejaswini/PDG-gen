import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s1 = br.readLine();
        String s2 = br.readLine();

        int n = s1.length();
        int count = 0;
        for(int i=0 ; i<n ; i++) {
            if(s1.charAt(i) == s2.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
