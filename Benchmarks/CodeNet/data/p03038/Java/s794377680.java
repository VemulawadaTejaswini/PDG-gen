
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Integer> A = new ArrayList<>();

        for(int i=0; i<N; i++){
            A.add(sc.nextInt());
        }

        List<Integer> list = new ArrayList<>();

        for(int j=0; j<M; j++){
            int B = sc.nextInt();
            int C = sc.nextInt();
            for(int k=0; k<B; k++){
                list.add(C);
            }
        }

        sc.close();

        A.sort(null);
        list.sort(null);

        for(int j=0; j<Integer.min(list.size(), N); j++){

            if(A.get(j) >= list.get(list.size()-j-1)){
                break;
            }
            A.set(j, list.get(list.size()-j-1));
        }

        BigInteger sum = BigInteger.ZERO;

        for(int i=0; i<N; i++){
            sum = sum.add(BigInteger.valueOf(A.get(i)));
        }

        System.out.println(sum);

    }


}