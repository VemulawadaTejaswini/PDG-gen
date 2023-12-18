
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        ArrayList<SimpleEntry<Integer, Integer>> list = new ArrayList<SimpleEntry<Integer, Integer>>();
        for(int i=0;i<N;i++){
            list.add(new SimpleEntry<Integer, Integer>(i+1, sc.nextInt()));
        }
        Collections.sort(list,Comparator.comparing(SimpleEntry::getValue));
        for(int i=0;i<N;i++){
            System.out.print(list.get(i).getKey()+" ");
        }
        System.out.println();
    }
}