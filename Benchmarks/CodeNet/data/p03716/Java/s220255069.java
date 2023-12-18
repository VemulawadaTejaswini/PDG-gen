
import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[3*n];
        for(int i = 0;i<3*n;i++ ){
            a[i] = sc.nextInt();
        }
        List<Integer> list =Arrays.asList(a);
        int result = 0;
        for(int i = n; i <= n * 2;i++){
            List<Integer> left = list.subList(0, i);
            List<Integer> right = list.subList(i, 3*n);

            left = new ArrayList<Integer>(left);
            right = new ArrayList<Integer>(right);

            left.sort( Comparator.reverseOrder());
            right.sort( Comparator.naturalOrder());

            List<Integer> left2 = left.subList(0, n);
            List<Integer> right2 = right.subList(0, n);

            int leftScore = left2.stream().mapToInt( x -> x.intValue() ).sum();
            int rightScore =  right2.stream().mapToInt( x -> x.intValue() ).sum();

            if(result < (leftScore - rightScore)){
                result = leftScore - rightScore ;
            }
        }

        System.out.print(result);
    }


}