import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

import com.sun.java.swing.plaf.windows.WindowsTreeUI.CollapsedIcon;

public class IntegerCards {

    static final int modnum = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] a = new int[N];

        for(int i = 0; i<N;i++){
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        // HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<SimpleEntry<Integer,Integer>> list = new ArrayList<SimpleEntry<Integer,Integer>>();

        for(int i=0;i<M;i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            // if(map.containsKey(c))
            //     map.put(c,map.get(c)+b);
            // else
            //     map.put(c,b);
            list.add(new SimpleEntry<Integer,Integer>(c,b));
        }

        Collections.sort(list,Comparator.comparing(SimpleEntry<Integer,Integer>::getKey).reversed());

        int j = 0;
        for(int i=0;i<list.size();i++){
            SimpleEntry<Integer,Integer> pair = list.get(i);
            // System.out.println(pair.toString());
            for(int k=0;k<pair.getValue();k++){
                if(j < N && a[j]<pair.getKey())
                    a[j++]=pair.getKey();
                else
                    break;
            }
        }

        long ans = 0;
        for(int i=0;i<N;i++){
            ans+=a[i];
        }

        // System.out.println(Arrays.toString(a));
        System.out.println(ans);
    }
}