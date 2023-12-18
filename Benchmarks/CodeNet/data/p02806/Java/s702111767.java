import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> sl = new ArrayList<String>();
        List<Integer> il = new ArrayList<Integer>();
        for(int i = 0; i < n; i++){
            sl.add(sc.next());
            il.add(sc.nextInt());
        }
        String last = sc.next();
        int lastInd = sl.indexOf(last);
        int ans = 0;
        for(int i = lastInd+1; i < n; i++){
            ans += il.get(i);
        }
        System.out.println(ans);
    }
}

