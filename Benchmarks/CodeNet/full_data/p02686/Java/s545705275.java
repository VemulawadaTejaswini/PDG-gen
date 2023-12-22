import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> y[1] - x[1]);
        PriorityQueue<int[]> nq = new PriorityQueue<>((x, y) -> (x[1]-x[0]) - (y[1]-y[0]));
        PriorityQueue<int[]> eq = new PriorityQueue<>((x, y) -> y[0]-x[0]);
        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            int sum = 0;
            int min = 0;
            for (int j = 0; j < s.length; j++) {
                if(s[j] == '(') sum++;
                else sum--;
                min = Math.min(min, sum);
            }
            if(min == 0) pq.add(new int[]{sum, min});
            else if(min == sum) eq.add(new int[]{sum, min});
            else nq.add(new int[]{sum, min});
        }
        int sum = 0;
        boolean ok = true;
        while(!pq.isEmpty()){
            int[] x = pq.poll();
            sum += x[0];
        }
        while(!nq.isEmpty()){
            int[] x = nq.poll();
            if(sum + x[1] < 0){
                ok = false;
                break;
            }
            sum += x[0];
        }
        while(!eq.isEmpty()){
            int[] x = eq.poll();
            if(sum + x[1] < 0){
                ok = false;
                break;
            }
            sum += x[0];
        }
        System.out.println(ok && sum == 0 ? "Yes" : "No");
        sc.close();

    }

}
