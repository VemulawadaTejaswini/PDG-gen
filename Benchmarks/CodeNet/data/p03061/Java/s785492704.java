import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i=0; i<N; i++){
            A.add(scanner.nextInt());
        }

        List<Integer> L = new ArrayList<>();
        List<Integer> R = new ArrayList<>();
        List<Integer> GCDatI = new ArrayList<>();

        for(int i=0; i<N; i++){
            L.add(0);
            R.add(0);
            GCDatI.add(0);
        }
        
        for(int i=0; i<N; i++){
            if(i==0){
                L.set(i,0);
            }else{
                L.set(i, GCD(L.get(i-1), A.get(i-1)));
            }
        }

        for(int i=N-1; i>=0; i--){
            if(i==N-1){
                R.set(i,0);
            }else{
                R.set(i, GCD(R.get(i+1), A.get(i+1)));
            }
        }

        for(int i=0; i<N; i++){
            GCDatI.set(i, GCD(L.get(i),R.get(i)));
        }
        System.out.println(Collections.max(GCDatI));
    }

    public static int GCD(int a, int b){
        int large;
        int small;
        if(a<b){
            large = b;
            small = a;
        }else{
            large = a;
            small = b;
        }
        if(small == 0){
            return large;
        }
        int temp;
        while( (temp=large%small) != 0){
            large = small;
            small = temp;
        }
        return small;
    }
}