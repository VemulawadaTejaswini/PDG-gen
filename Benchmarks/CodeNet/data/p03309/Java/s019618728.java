import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> b_num_list = new ArrayList<>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            int b_num = num - (i+1);
            List.add(b_num);
            if(!b_num_list.contains(b_num))b_num_list.add(b_num);
        }
        int opt =999999999;
        for(int i=0;i<b_num_list.size();i++){
            int num = b_num_list.get(i);
            int sum =0;
            for(int j=0;j<List.size();j++){
                sum+=Math.abs(List.get(j)-num);
            }
            if(opt>sum) opt= sum;
        }
        System.out.println(opt);
    }
}
