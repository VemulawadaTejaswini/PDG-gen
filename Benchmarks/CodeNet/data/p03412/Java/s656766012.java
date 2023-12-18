import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int[] b = new int[N];
        
        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(sc.next());
        } 
        for(int i=0;i<N;i++){
            b[i] = Integer.parseInt(sc.next());
        }
        
        int xor = 0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int c = a[i]+b[j];
                xor = c^xor;
            }
        }
        System.out.println(xor);
    }
}
