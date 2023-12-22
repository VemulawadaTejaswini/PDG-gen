import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //命令の回数
        int q = Integer.parseInt(sc.next());
        int order,num;
        List<Integer> list = new ArrayList<>(q);
        for(int i=0; i<q; i++){
            //命令の種類
            order = Integer.parseInt(sc.next());
            //0:pushBack
            if(order == 0){
                num = Integer.parseInt(sc.next());
                list.add(num);
            }
            //1:randomAccess
            else if(order == 1){
                num = Integer.parseInt(sc.next());
                System.out.println(list.get(num));
            }
            //2:popBack
            else if(order == 2){
                list.remove(list.size()-1);
            }
        }
    }
}

