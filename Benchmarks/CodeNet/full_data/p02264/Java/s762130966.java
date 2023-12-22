import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
        static class Pair {
                int quan=0;
                String val="";
                Pair(int x , String y){
                    this.quan = x;
                    this.val = y;
                }
            }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int quantum = sc.nextInt();
            q.add(new Pair(quantum,name));
        }

        int elapse = 0;
        while(!q.isEmpty()){
            Pair current = q.poll();
            int qu = current.quan;
            if(qu > Q){
                current.quan = qu-Q;
                elapse+=Q;
                q.add(current);
            }else{
                elapse+=current.quan;
                System.out.println(current.val +" "+elapse);
            }
        }




    }

}

