import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int D = Integer.parseInt(scan.next());
        int X = Integer.parseInt(scan.next());
        int[] A = new int[N];
        int[] cou = new int[N];
        for(int i = 0;i<N;i++){
            A[i] = Integer.parseInt(scan.next());
            cou[i]++;
            continue;
        }
        for(int i = 0;i<N;i++){
            for(int k = 0;k<D;k++){
                if (A[i]*(k+1)+1<=D) {
                    cou[i] ++;
                }else{
                    break;
                }
            }
        }
        int out=0;
        for(int i = 0;i<N;i++){
            out += cou[i];
        }
        System.out.println(out+X);
    }
}