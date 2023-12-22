import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //リスト定義
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
        
        int num = sc.nextInt();
        
        int pattern;    //d
        int number = 0,order;
        for(int i = 0;i < num;i++){
            //命令変数定義
            order = sc.nextInt();
            //条件定義
            switch(order){
                //push
                case 0:
                    pattern = sc.nextInt();
                    number = sc.nextInt();
                    //先頭に追加
                    if(pattern == 0)    deque.addFirst(number);
                    //末尾に追加
                    else if(pattern == 1)   deque.addLast(number);
                    break;
                //randomAccess
                case 1:
                    number = sc.nextInt();
                    Iterator<Integer> ite = deque.iterator();
                    for(int j = 0;j < number;j++)   ite.next();
                    System.out.println(ite.next());
                    break;
                //pop
                case 2:
                    pattern = sc.nextInt();
                    //先頭削除
                    if(pattern == 0)    deque.removeFirst();
                    //末尾削除
                    if(pattern == 1)    deque.removeLast();
                    break;
            }
        }
    }
}
