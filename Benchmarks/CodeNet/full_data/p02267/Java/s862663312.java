import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        n: 5
        S: 1 2 3 4 5 
        q: 3
        T: 3 4 1
        out: 3
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n+1];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < q; i++) {
            if(search(sc.nextInt(),n,s))ans++;;
        }
        System.out.println(ans);
    }
    
    static boolean search(int key, int n, int[] s) {
        s[n] = key;
        int i = 0;
        while(s[i] != key){
            i++;
        }
        return i != n;
    }
}
