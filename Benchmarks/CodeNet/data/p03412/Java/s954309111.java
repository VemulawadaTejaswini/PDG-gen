import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int[] b = new int[N];
        
        int abmax = (int) Math.pow(2, 28);
        
        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(sc.next());
        } 
        for(int i=0;i<N;i++){
            b[i] = Integer.parseInt(sc.next());
        }
        int[] xor = new int[29];
        for(int i=0;i<29;i++){
            xor[i]=0;
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int c = a[i]+b[j];
                int pow = abmax;
                for(int k=28;k>-1;k--){
                    if(c/pow == 1){
                        c = c%pow;
                        xor[k] = (xor[k]+1)%2;
                    }
                    pow = pow/2;
                }
            }
        }
        int ans = 0;
        int pow = 1;
        for(int i=0;i<29;i++){
            ans += pow*xor[i];
            pow = pow * 2;
        }
        System.out.println(ans);
    }
}