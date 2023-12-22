import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int x = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        if(n == 0) {
            System.out.print(x);
            return;
        }

        s = br.readLine().split(" ");
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++)
            set.add(Integer.parseInt(s[i]));
        
        if(!set.contains(x)) {
            System.out.print(x);
            return;
        }
        int nearest = 1;
        while(true) {
            if(!set.contains(x-nearest)) {
                System.out.print(x-nearest);
                return;
            }

            if(!set.contains(x+nearest)) {
                System.out.print(x+nearest);
                return;
            }
            nearest++;
        }
    }
}