import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ", 0);
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        
        Queue[] pq = new Queue[n];
        for (int i = 0; i < n; i++) {
            pq[i] = new Queue();
        }
        
        String[] l;
        String command;
        int t, x;
        for (int i = 0; i < q; i++) {
            l = br.readLine().split(" ", 0);
            command = l[0];
            t = Integer.parseInt(l[1]);
            switch (command) {
                case "0":
                    x = Integer.parseInt(l[2]);
                    pq[t].insert(x);
                    break;
                case "1":
                    pq[t].getMax();
                    break;
                case "2":
                    pq[t].deleteMax();
                    break;
            }
        }
    }
}

class Queue {
    ArrayList<Integer> a;
    
    Queue() {
        a = new ArrayList<Integer>();
    }
    
    void insert(int x) {
        int size = a.size();
        if (size == 0) {
            a.add(x);
            return;
        }
        int p = binarySearch(x, 0, a.size() - 1);
        //System.out.println("size = " + a.size());
        //System.out.println("inserted: p=" + p);
        if (p == a.size()) {
            a.add(x);
        } else {
            a.add(p, x);
        }
    }
    
    void getMax() {
        int size = a.size();
        if (size != 0) {
            System.out.println(a.get(size - 1));
            //System.out.println(a);
        }
    }
    
    void deleteMax() {
        int size = a.size();
        if (size != 0) {
            a.remove(size - 1);
        }
    }
    
    int binarySearch(int num, int l, int r) {
        if (l >= r - 1) {
            if (num <= a.get(l)) {
                return l;
            } else if (a.get(r) <= num) {
                return r + 1;
            } else {
                return l + 1;
            }
        }
        int m = (l + r) / 2;
        int ret;
        if (a.get(m) == num) {
            ret = m;
        } else if (num < a.get(m)) {
            ret = binarySearch(num, l, m - 1);
        } else {
            ret = binarySearch(num, m + 1, r);
        }
        return ret;
    }
}

    

