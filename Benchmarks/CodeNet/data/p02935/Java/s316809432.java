

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
        double ans = arr.get(0);

        for(int i = 1; i < arr.size(); i++){
            ans = (arr.get(i) + ans) / 2.0;
        }

        System.out.println(ans);

    }
}
