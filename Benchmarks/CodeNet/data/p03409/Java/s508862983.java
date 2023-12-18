import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int [] ax_array = new int[n];
        int [] by_array = new int[n];
        for (int i = 0; i < n; i++){
            ax_array[i] = in.nextInt();
            by_array[i] = in.nextInt();
        }
        List<Integer> notAvaible = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            for (int j = 0; j < n; j++){
                if ( !notAvaible.contains(j) && ax_array[j] < x && by_array[j] < y){
                    sum++;
                    notAvaible.add(j);
                    break;
                }
            }
        }
        System.out.println(sum);
    }

}