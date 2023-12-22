import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int [] numberArray = new int[n];
        for (int i = 0 ; i < n ; i++){
            numberArray[i] = sc.nextInt();
        }
        for (int j = 0 ; j < q ; j++){
            Set<Integer> integerSet = new HashSet<>();
            int l = sc.nextInt();
            int r = sc.nextInt();
            for (int i = l-1; i < r ; i++){
                integerSet.add(numberArray[i]);
            }
            System.out.println(integerSet.size());
        }
    }
}
