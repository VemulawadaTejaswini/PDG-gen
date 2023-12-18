import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
        	a[i] = sc.nextInt();
        	list.add(String.valueOf(a[i]));
        }
        for(int i = 0; i < n; i++) {
        	list.remove(String.valueOf(a[i]));
        	Collections.sort(list);
        	System.out.println(list.get((n-1)/2));
        	list.add(String.valueOf(a[i]));
        }
    }
}