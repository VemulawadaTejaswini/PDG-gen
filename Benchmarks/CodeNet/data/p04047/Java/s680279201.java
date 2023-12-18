import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num=0;
        int N = sc.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for(int a=0;a<2*N;a++){
            int l = sc.nextInt();
            L.add(l);
        }
        Collections.sort(L);
        for(int a=0;a<N;a++){
            num += L.get(2*a);
        }
        System.out.println(num);
    }
}