import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by DELL on 2017/7/15.
 */
public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int sum=0,j=0;
        List<Long> list=new ArrayList();
        BigInteger min;
        int N=in.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(in.nextLong());
        }
        Long summ=list.parallelStream().mapToLong(x->x).sum();
        sum+=list.get(0);
        if(N>2){
            min=BigInteger.valueOf(Math.abs(2*sum-summ));
        for (int i = 1 ; i <N-1 ; i++) {
            sum+=list.get(i);
            if(BigInteger.valueOf(Math.abs(2*sum-summ)).compareTo(min)==-1){
                min=BigInteger.valueOf(Math.abs(2*sum-summ));
            }
        }
            System.out.println(min);
        }
        else System.out.println(Math.abs(list.get(0)-list.get(1)));



    }

}
