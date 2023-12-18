import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        int total = sc.nextInt();
        ArrayList<Integer> ansList = new ArrayList<>();
        ansList.add(-1);
        ansList.add(-1);
        ansList.add(-1);

        for(int i=0; i<=nb; i++){
            for(int j=0; j<=nb; j++){
                int k = nb - i - j;
                int nb_sum = i + j + k;
                if (nb_sum != nb){
                    continue;
                } else {
                    int total_sum = i*10000 + j*5000 + k*1000;
                    if (total_sum == total){
                        ansList.set(0, i);
                        ansList.set(1, j);
                        ansList.set(2, k);

                        break;
                    }
                }
            }
        }

        for(int i=0; i<ansList.size(); i++){
            if (i == ansList.size() - 1){
                System.out.println(ansList.get(i));
            } else {
                System.out.print(String.format("%d ", ansList.get(i)));
            }
        }
    }
}
