import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 1;
        while(true) {
            if(M * (M-1) < 2 * N) {
                M++;
                continue;
            }
            if(M * (M-1) == 2 * N) {
                break;
            }
            System.out.println(String.format("No"));
            return;
        }
        System.out.println(String.format("%d", M));

        ArrayList<Integer> a[] = new ArrayList[M];
        for(int i=0; i<M; i++) {
            a[i] = new ArrayList<>();
        }
        int s=0;
        int t=1;
        int v=1;
        while(s<M-1) {
            while(t<M) {
                a[s].add(v);
                a[t].add(v);
                v++;
                t++;
            }
            s++;
            t=s+1;
        }
        for(int i=0; i<M; i++) {
            for(int k=0; k<a[i].size(); k++) {
                if(k!=0) System.out.print(" ");
                System.out.print(String.format("%d", a[i].get(k)));
            }
            System.out.println();
        }
    }
}