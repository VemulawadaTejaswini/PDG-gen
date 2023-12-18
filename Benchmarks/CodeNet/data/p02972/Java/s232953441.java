import java.util.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        int M = 0;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            b[i] = 0;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=N-1; i>=0; i--){
            int sum = 0;
            for(int j=1; j<=N; j++){
                if((i+1)*j<=N){
                    sum += b[(i + 1) * j - 1];
                }
            }
            if(sum%2!=a[i]){
                b[i] = 1;
                M += 1;
                list.add(i + 1);
            }
        }
        System.out.println(M);
        for(int i=0; i<M; i++){
            if(i==0){
                System.out.print(list.get(i));
            }
            else{
                System.out.print(" " + list.get(i));
            }
        }
    }
}