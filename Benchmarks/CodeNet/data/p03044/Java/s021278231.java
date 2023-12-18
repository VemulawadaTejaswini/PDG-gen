import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<List<Integer>> edge = new ArrayList<>(N+1);
        List<List<Integer>> cost = new ArrayList<>(N+1);
        for(int i=1;i<=N+1;i++){
          edge.add(new ArrayList<>());
          cost.add(new ArrayList<>());
        }

        for(int i=1;i<=N;i++){
          edge.get(i).add(0);
          cost.get(i).add(0);
        }

        for(int i=1;i<=N-1;i++){
          int u = sc.nextInt();
          int v = sc.nextInt();
          int w = sc.nextInt();

            edge.get(u).add(v);
            edge.get(v).add(u);
            cost.get(u).add(w);
            cost.get(v).add(w);

        }


        Deque <Integer> dq = new ArrayDeque<>();
        int status [] = new int[N+1];
        int ans [] = new int[N+1];

        for(int i=1;i<=N;i++){
            ans[i]=0;
            status[i]=0;
        }
        dq.push(1);
        status[1]=1;
        while(!dq.isEmpty()){
            int senisakiari_flg = 0;
            int last_in = dq.peek();

            for(int i = 1;i <= edge.get(last_in).size()-1;i++){
                if(status[edge.get(last_in).get(i)] == 0){
                    senisakiari_flg = 1;
                    status[edge.get(last_in).get(i)]=1;
                    ans[edge.get(last_in).get(i)] = ((cost.get(last_in).get(i)) % 2 + ans[last_in]) % 2;
                    dq.push(edge.get(last_in).get(i));

                    break;
                }
            }

            if(senisakiari_flg==0){
                dq.pop();
            }
        }
        for (int i=1;i<=N ;i++) {
            System.out.println(ans[i]);
        }
    }
}

