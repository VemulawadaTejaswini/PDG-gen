import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        ArrayList<Integer> ans = new ArrayList<>();

        while (true) {
            boolean cont = false;
            for (int i = l.size() - 1; i >= 0; i--) {
                if (l.get(i) == i + 1) {
                    l.remove(i);
                    ans.add(i + 1);
                    cont = true;
                    break;
                }
            }
            if (!cont)
                break;
        }
        
        if (l.size() != 0)
            System.out.println("-1");
        else 
            for(int i = ans.size() - 1; i >= 0; i--) 
                System.out.println(ans.get(i));

        



    }
}