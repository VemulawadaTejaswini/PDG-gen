import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<3; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int K = sc.nextInt();
        int max = list.get(2);
        for(int i=0; i<K; i++){
            max *= 2;
        }
        System.out.println(list.get(0) + list.get(1) + max);
    }
}