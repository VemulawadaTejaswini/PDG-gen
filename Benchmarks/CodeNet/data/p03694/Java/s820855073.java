import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.next());
        
        int[] a = new int[N];
        int min = 1000;
        int max = 0;
        for(int i=0; i<N; i++){
            a[i] = Integer.parseInt(sc.next());
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        System.out.println(max - min);
    }
}