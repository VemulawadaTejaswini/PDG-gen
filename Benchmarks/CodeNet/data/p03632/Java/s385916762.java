import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int[] r = new int[101];
        
        for(int i = a; i <= b; i++){
            r[i]++;
        }
        
        for(int i = c; i <= d; i++){
            r[i]++;
        }
        
        int res = 0;
        
        for(int i = 0; i <= 100; i++){
            if(r[i] == 2) res++;
        }
        
        System.out.println(res == 0 ? 0 : res - 1);
    }
}
