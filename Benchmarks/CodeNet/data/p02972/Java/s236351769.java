import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        int[] a = new int[N];
        int[] resa = new int[N];
        String[] s = stdR.readLine().split(" ");
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
        
        for(int i = 2 ; i <= 200000 ; i++) {
            boolean isprime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if(isprime)primes.add(i);
        }
        
        for(int i = 0 ; i < N ; i++) {
            a[i] = Integer.parseInt(s[i]);
            resa[i] = -1;
        }
        int counter = 0;
        for(int i = N ; i >= 1 ; i--) {
            int p_counter = 0;
            int number = i * primes.get(p_counter);
            int now = 0;
            while(number <= N) {
                now += resa[number - 1];
                p_counter++;
                number *= primes.get(p_counter);
            }
            now = now % 2;
            if(now == 1) {
                if(now != a[i - 1]) {
                    resa[i - 1] = 1;
                    counter++;
                }else {
                    resa[i - 1] = 0;
                }
            }else {
                if(now != a[i - 1]) {
                    resa[i - 1] = 1;
                    counter++;
                }else {
                    resa[i - 1] = 0;
                }
            }
        }
        if(counter == 0) {
            System.out.println(0);
        }else {
            System.out.println(counter);
            String str = "";
            for(int i = 0 ; i < N ; i++) {
                if(resa[i] == 1) {
                    str += (i + 1)+" ";
                }
            }
            System.out.println(str.substring(0,str.length() - 1));
        }
    }

}