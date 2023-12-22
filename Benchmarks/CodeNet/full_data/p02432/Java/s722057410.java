import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque a = new Deque();
        
        int n = Integer.parseInt(br.readLine());
        
        String l;
        char query, d;
        int p;
        long x;
        for (int i = 0; i < n; i++) {
            l = br.readLine();
            query = l.charAt(0);
            switch (query) {
                case '0':
                    d = l.charAt(2);
                    x = Long.valueOf(l.substring(4));
                    if (d == '0') {
                        a.addFirst(x);
                    } else {
                        a.addLast(x);
                    }
                    break;
                case '1':
                    p = Integer.parseInt(l.substring(2));
                    System.out.println(a.getElementAt(p));
                    break;
                case '2':
                    d = l.charAt(2);
                    if (d == '0') {
                        a.removeFirst();
                    } else {
                        a.removeLast();
                    }
                    break;
            }
        }
    }
}

class Deque {
    int l = 499999, r = 500000;
    long[] a;
    
    Deque() {
        a = new long[1000000];
    }
    
    void addFirst(long x) {
        a[l] = x;
        l--;
    }
    void addLast(long x) {
        a[r] = x;
        r++;
    }
    long getElementAt(int index) {
        return a[index + l + 1];
    }
    void removeFirst() {
        l++;
    }
    void removeLast() {
        r--;
    }
}
    

