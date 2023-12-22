import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Map<Integer,PriorityQueue<Long>> List = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            PriorityQueue<Long> L = new PriorityQueue<>(Collections.reverseOrder());
            List.put(i,L);
        }
        for(int i=0;i<q;i++){
            int cmd = sc.nextInt();
            int t = sc.nextInt();
            if(cmd==0){
                long x = sc.nextLong();
                List.get(t).add(x);
            }
            else if(cmd==1&&List.get(t).size()!=0)sb.append(List.get(t).peek()+"\n");
            else if(cmd==2&&List.get(t).size()!=0)   List.get(t).poll();
        }
        System.out.print(sb);
    }
}
