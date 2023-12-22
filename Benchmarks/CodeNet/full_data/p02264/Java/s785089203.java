import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   //プロセス数
        int q = sc.nextInt();   //クオンタム
        int R_time = 0;   //実時間

        ArrayDeque<Proc> queue = new ArrayDeque<>();    //キュー
        Proc tmp;

        for(int i = 0;i < n;i++){
            String name = sc.next();    //プロセス名
            int P_time = sc.nextInt();    //プロセス時間
            queue.add(new Proc(name,P_time));
        }

        while(queue.size() > 0){
            //クオンタム以下
            if(queue.getFirst().num <= q){
                R_time += queue.getFirst().num;
                System.out.println(queue.getFirst().name+" "+R_time);
                queue.removeFirst();
            }
            else{
                R_time += q;
                tmp = queue.getFirst(); //先頭をコピー
                tmp.num -= q;   //プロセス時間からクオンタムを引く
                queue.addLast(tmp); //先頭を末尾に
                queue.removeFirst();    //先頭削除
            }
        }
    }
}

class Proc{
    String name;
    int num;

    Proc(String name,int num){
        this.name = name;
        this.num = num;
    }
}
