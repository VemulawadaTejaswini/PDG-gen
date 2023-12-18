import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        PriorityQueue<int[]> q = new PriorityQueue<>((x,y) -> y[0]-x[0]);
        for (int i = 0; i < n; i++) {
            char[] s = sc.next().toCharArray();
            int sum = 0;
            int min = 0;
            for (int j = 0; j < s.length; j++) {
                if(s[j] == '(') sum++;
                else sum--;
                min = Math.min(min, sum);
            }
            a[i][0] = sum;
            a[i][1] = min;
            q.add(a[i]);
        }
        int sum = 0;
        boolean ok = true;
        List<int[]> list = new ArrayList<>();
        while(!q.isEmpty()){
            int[] x = q.poll();
            if(sum + x[1] < 0){
                list.add(x);
            }else{
                sum += x[0];
                if(!list.isEmpty()){
                    q.addAll(list);
                    list.clear();
                }
            }
        }
        if(!list.isEmpty()) ok = false;
        System.out.println(ok && sum == 0 ? "Yes" : "No");
        sc.close();

    }

}
