import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Abhijeetkns
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BDoNotDuplicate solver = new BDoNotDuplicate();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDoNotDuplicate {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long k = in.nextLong();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
            Integer val = 1;
            while (k > 0) {

                for (int i = 0; i < n; i++) {
                    if (!list.contains(arr[i])) {
                        list.add(arr[i]);
                    } else {
                        int index = list.indexOf(arr[i]);
                        ArrayList<Integer> list1 = new ArrayList<>();
                        //list1.addAll(index,list);
                        for (int j = list.size() - 1; j >= index; j--) list1.add(list.get(j));
                        //out.println("list1: "+list1);
                        list.removeAll(list1);
                        //out.println("list: "+list);
                    }
                }
                //out.println("list outside: "+list);
                //out.println("value of val before increment: "+val);
                //out.println(map);
                map.put(val, new ArrayList<>(list));
                //out.println(map.get(val));
                //out.println(map);
                val++;
                //out.println("value of val after increment: "+val);
                k--;
                if (list.size() == 0) break;
            }
            //out.println("map size:"+map.size());
            //out.println(map);
            for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
                //out.println("key value: "+entry.getKey()+" "+"value of key: "+map.get(val));
                if ((k - entry.getKey()) % map.size() == 0) {
                    ArrayList<Integer> list1 = entry.getValue();
                   // out.println("list1 in if: "+list1+" "+"key value in if : "+entry.getKey());
                    for (int i = 0; i < list1.size(); i++) out.print(list1.get(i) + " ");
                    break;
                }
            }
        }

    }
}