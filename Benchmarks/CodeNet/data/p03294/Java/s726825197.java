import java.util.Scanner;

/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] a = new int[N];
        for(int i=0;i<N;i++){
            a[i]= sc.nextInt();
        }
        
        int max = 0;
        for(int i=0;i<100000;i++){
            int tmod = xmody(i, a);
            if(max<tmod){
                max = tmod;
            }
        }
        System.out.println(max);
    }
    
    private static int xmody(int m, int[] a){
        int n = a.length;
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum += m % a[i];
        }
        return sum;
    }
}