import java.util.*;

class Main{
    public static void main(String[] args){
    Queue<String> queue = new ArrayDeque<String>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //処理する数
    int q = sc.nextInt(); //クオンタム
    int sum = 0;          //処理した数
    int sumTime = 0;      //合計処理時間
    for(int i = 0; i < 2*n; i++){
        String x = sc.next();
        queue.add(x);
    }
    /*処理部分*/
    while(sum != n){
        String name = queue.poll();
        int time = Integer.parseInt(queue.poll());
        if(time > q){
            sumTime += q;
            time -= q;
            queue.add(name);
            queue.add(String.valueOf(time));  //intをInteger経由でStringに変換している
        }
        else{
            sumTime += time;
            sum++;
            System.out.println(name +" "+sumTime);
        }
    }

    }
}
