import java.io.*;
import java.util.*;

public class Main {

    static void print_lst(List<Integer> lst, int n) {
        for(int i=0; i<n-1; i++) {
            System.out.print(lst.get(i) + " ");
        }
        System.out.println(lst.get(n-1));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        List<Integer> lst = new ArrayList<>();

        n = sc.nextInt();
        for(int i=0; i<n; i++) {
            lst.add(sc.nextInt());
        }
        print_lst(lst, n);

        for(int i=1; i<n; i++) {
            int tmp = lst.get(i);
            int j = i-1;
            while(j >=0 && lst.get(j) > tmp) {
                lst.set(j+1, lst.get(j));
                j--;
            }
            lst.set(j+1, tmp);
            print_lst(lst, n);
        }

    }
}