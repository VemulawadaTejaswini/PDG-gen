
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            x.add(Integer.parseInt(sc.next()));
        }
        ArrayList<Integer> y;
        for(int i=0;i<n;i++){
            y=x;
            y.remove(i);
            Collections.sort(y);
            System.out.println(y.get(n/2));
        }
    }
}