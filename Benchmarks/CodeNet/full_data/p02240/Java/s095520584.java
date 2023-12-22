import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;
 
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        List<PriorityQueue<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            PriorityQueue<Integer> set = new PriorityQueue<>();
            list.add(set);
        }
 
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            list.get(s).add(t);
            list.get(t).add(s);
        }
 
        int groupnum = 0;
        int[] group = new int[n];
        for(int i = 0; i < n; i++) {
            if(group[i] == 0) {
                groupnum++;
                group[i] = groupnum;

                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                while(!stack.isEmpty()) {
                    int j = stack.pop();
                    while(!list.get(j).isEmpty()) {
                        int k = list.get(j).poll();
                        if(group[k] == 0) {
                            group[k] = groupnum;
                            stack.push(k);
                        }
                    }
                }
            }
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            System.out.println(group[s] == group[t]? "yes" : "no");
        }
 
        sc.close();
    }
}
