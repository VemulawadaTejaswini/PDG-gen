import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> num_list = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int num=0;
        for(int a=0;a<3;a++){
            num_list.add(sc.nextInt());
        }
        int max_num = Collections.max(num_list);
        for(int a=0;a<3;a++){
            if(max_num-num_list.get(a)!=0) list.add(max_num-num_list.get(a));
        }
        if(list.size()==2) {
            int num1 = list.get(0) % 2;
            int num2 = list.get(1) % 2;
            if (num1 == 0 && num2 == 0) {
                num += list.get(0) / 2;
                num += list.get(1) / 2;
            } else if (num1 == 1 && num2 == 1) {
                num += list.get(0) / 2 + list.get(1) / 2 + 1;
            } else if ((num1 == 1 && num2 == 0) || (num1 == 0 && num2 == 1)) {
                num += list.get(0) / 2 + num1;
                num += list.get(1) / 2 + num2 + 1;
            }
        }
        else if(list.size()==1){
            num+= list.get(0)/2+list.get(0)%2;
        }
        else num=0;
        System.out.println(num);
    }
}