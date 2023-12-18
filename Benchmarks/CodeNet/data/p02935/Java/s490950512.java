import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Double> arr = new ArrayList<>();
        for(int i = 0; i < n; i++) arr.add((double) sc.nextInt());
        sc.close();

        Collections.sort(arr);
        for(int i = 0; i < arr.size()-1; i++){
            double current = (arr.get(i) + arr.get(i+1)) / 2.0;
            arr.set(i+1, current);
            arr.remove(arr.remove(i));
        }
        
        double ans = arr.size() > 1 ? (arr.get(0) + arr.get(1)) / 2.0 : arr.get(0);
        System.out.println(String.format("%f", ans));

    }
}