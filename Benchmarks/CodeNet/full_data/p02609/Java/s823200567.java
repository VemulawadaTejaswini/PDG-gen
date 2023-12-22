import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        
        if (n == 1 && c[0] == 0) {
            System.out.println(0);
            return;
        }
        
        int onecount = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] == '1') onecount++;
        }
        // System.out.println(onecount);
        int p = onecount;
        
        long[] s = new long[n+1];
        int two = 1;
        for (int i = n - 1; i >= 0; i--) {
            // ex. c[i] * 10^x(mod m)
            // -> c[i] * (10^(x-1)(mod m) * 10^1 % m)
            // (10^(x-1)(mod m)は前のループで求めてる)
            
            long a = ((c[i] - '0') * two) % p;
            s[i] = (s[i+1] + a) % p;
            two = (two * 2) % p;
        }
        
        long[] sA = new long[n+1];
        two = 1;
        p--;
        if (p == 0) {
            
        } else {
            for (int i = n - 1; i >= 0; i--) {
                // ex. c[i] * 10^x(mod m)
                // -> c[i] * (10^(x-1)(mod m) * 10^1 % m)
                // (10^(x-1)(mod m)は前のループで求めてる)
                
                long a = ((c[i] - '0') * two) % p;
                sA[i] = (sA[i+1] + a) % p;
                two = (two * 2) % p;
            }
        }
        
        long[] sB = new long[n+1];
        two = 1;
        p += 2;
        for (int i = n - 1; i >= 0; i--) {
            // ex. c[i] * 10^x(mod m)
            // -> c[i] * (10^(x-1)(mod m) * 10^1 % m)
            // (10^(x-1)(mod m)は前のループで求めてる)
            
            long a = ((c[i] - '0') * two) % p;
            sB[i] = (sB[i+1] + a) % p;
            two = (two * 2) % p;
        }
        p--;
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (c[i] == '1') {
                int nowp = p-1;
                long[] sC = new long[n+1];
                char[] tmpc = new char[n];
                tmpc[i] = 1;
                two = 1;
                for (int j = n - 1; j >= 0; j--) {
                    // ex. c[i] * 10^x(mod m)
                    // -> c[i] * (10^(x-1)(mod m) * 10^1 % m)
                    // (10^(x-1)(mod m)は前のループで求めてる)
                    
                    long a = ((tmpc[j] - '0') * two) % nowp;
                    sC[j] = (sC[j+1] + a) % nowp;
                    two = (two * 2) % nowp;
                }
                
                long tmp = sA[0] - sC[0];
                if (tmp < 0) tmp += nowp;
                int count = 0;
                while (tmp != 0) {
                    String st = Long.toBinaryString(tmp);
                    char[] cc = st.toCharArray();
                    int oc = 0;
                    for (int k = 0; k < st.length(); k++) {
                        if (cc[k] == '1') oc++;
                    }
                    
                    tmp %= oc;
                    count++;
                }
                System.out.println(count);
            } else {
                int nowp = p+1;
                long[] sC = new long[n+1];
                char[] tmpc = new char[n];
                tmpc[i] = 1;
                two = 1;
                for (int j = n - 1; j >= 0; j--) {
                    // ex. c[i] * 10^x(mod m)
                    // -> c[i] * (10^(x-1)(mod m) * 10^1 % m)
                    // (10^(x-1)(mod m)は前のループで求めてる)
                    
                    long a = ((tmpc[j] - '0') * two) % nowp;
                    sC[j] = (sC[j+1] + a) % nowp;
                    two = (two * 2) % nowp;
                }
                
                long tmp = sB[0] + sC[0];
                if (tmp < 0) tmp += nowp;
                int count = 0;
                while (tmp != 0) {
                    String st = Long.toBinaryString(tmp);
                    char[] cc = st.toCharArray();
                    int oc = 0;
                    for (int k = 0; k < st.length(); k++) {
                        if (cc[k] == '1') oc++;
                    }
                    
                    tmp %= oc;
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
