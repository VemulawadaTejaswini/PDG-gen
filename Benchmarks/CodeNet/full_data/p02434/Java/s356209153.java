import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
import java.lang.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ", 0);
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);
        
        myList[] a = new myList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new myList();
        }
        
        String l;
        String[] rem;
        char query;
        int t, x;
        for (int i = 0; i < q; i++) {
            l = br.readLine();
            query = l.charAt(0);
            rem = l.substring(2).split(" ", 0);
            t = Integer.parseInt(rem[0]);
            
            switch (query) {
                case '0':
                    x = Integer.parseInt(rem[1]);
                    a[t].pushBack(x);
                    break;
                case '1':
                    a[t].dump();
                    break;
                case '2':
                    a[t].clear();
                    break;
            }
        }
    }
}

class myList {
    List<Integer> list;
    
    myList() {
        list = new ArrayList<>();
    }
    
    void pushBack(int x) {
        list.add(x);
    }
    
    void dump() {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i));
            if (i != size - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    void clear() {
        list.clear();
    }
}
    

