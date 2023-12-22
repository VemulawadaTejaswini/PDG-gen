import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] s = new int[n+1];
        for(int i = 0; i < n; i++){
            s[i] = Integer.parseInt(sc.next());
        }
        int q = Integer.parseInt(sc.next());
        int c = 0;
        for(int i = 0; i < q; i++){
            int x = linearSearch(s, n, Integer.parseInt(sc.next()));
            if(x != -1) c++;
        }
        
        System.out.println(c);
    }
    
    static int linearSearch(int[] a, int n, int key){
        int i = 0;
        a[n] = key;
        while(a[i] != key){
            i++;
        }
        if(i == n) return -1;
        return i;
    }
}
