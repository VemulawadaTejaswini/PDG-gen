import java.util.ArrayList;
import java.util.Scanner;
//import java.util.List;

/**
 * Created by shoya on 2017/04/11.
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ar.add(sc.nextInt());
        //System.out.println(ar);
        insertionSort(ar);
    }

    static ArrayList<Integer> insertionSort(ArrayList<Integer> ar){
        for (int i = 0; i < ar.size(); i++){
            for (int j = 0; j < i; j++){
                if (ar.get(j) > ar.get(i)){
                    for (int k = i; k > j; k--){
                        int tmp = ar.get(k - 1);
                        ar.set(k - 1, ar.get(k));
                        ar.set(k, tmp);
                    }
                }
            }
            for (int n = 0; n < ar.size() - 1; n++)
                System.out.printf("%d ", ar.get(n));
            System.out.println(ar.get(ar.size() - 1));
        }
        return ar;
    }

}