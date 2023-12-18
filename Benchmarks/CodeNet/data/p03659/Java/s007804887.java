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
        List<Integer> list=new ArrayList();
        long min=1_000_000_001;
        int N=in.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(in.nextInt());
        }
        int summ=list.parallelStream().mapToInt(x->x).sum();
        sum+=list.get(0);
        if(j>2){
        for (int i = 1 ; i <N-2 ; i++) {
            sum+=list.get(i);
            if(Math.abs(sum-summ/2)<min){
                min=Math.abs(sum-summ/2);
            }
        }
        }
        else System.out.println(Math.abs(list.get(0)-list.get(1)));



    }

}