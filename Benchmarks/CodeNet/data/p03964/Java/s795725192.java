import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = 1;
        int l = 1;
        for(int i=0; i<N; i++){
            int T = sc.nextInt();
            int A = sc.nextInt();
            int k = Math.max(r/T,l/A);
            while(true){
                int x=k*T;
                int y=k*A;
                if(x>=r&&y>=l){
                    r=x;
                    l=y;
                    break;
                }
                k++;
            }
        }
        System.out.println(r+l);
    }
}
