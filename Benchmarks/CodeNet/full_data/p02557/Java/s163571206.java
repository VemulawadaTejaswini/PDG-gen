import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author kep
 * @date 2019-10-17
 */
public class Main {


    private static int[] a = new int[200005];
    private static int[] ans = new int[200005];
    private static int[] count = new int[200005];

    static class Node implements Comparable<Node>{
        int level;
        int value;
        Node(int level,int value){
            this.level = level;
            this.value = value;
        }

        @Override
        public int compareTo(Node o) {
            if(o.level == this.level){
                return this.value - o.value;
            }
            return this.level - o.level;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0;i<n;i++){
            a[i] = scanner.nextInt();
            count[a[i]]++;
        }
        List<Node> list = new LinkedList<>();
        for(int i = 0;i<n;i++){
            int b = scanner.nextInt();
            list.add(new Node(n-count[b],b));
        }
        Collections.sort(list);
        boolean flag = true;
        for(int i = 0;i<n;i++){
            Iterator<Node> it = list.iterator();
            Integer first = it.next().value;
            while(first == a[i] && it.hasNext()){
                first = it.next().value;
            }
            if(first != a[i]){
                ans[i] = first;
                it.remove();
            }else{
                flag = false;
                break;
            }
        }
        if(!flag){
            System.out.println("No");
        }else{
            for(int i =0;i<n;i++){
                if(i == 0){
                    System.out.print(ans[i]);
                }else{
                    System.out.print(" "+ans[i]);
                }
            }
            System.out.println();
        }


    }



}
