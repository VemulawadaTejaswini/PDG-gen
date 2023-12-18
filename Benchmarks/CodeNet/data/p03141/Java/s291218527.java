import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> List = new ArrayList<>();
        long bi_sum =0;
        for(int a=0;a<N;a++){
            long ai = sc.nextLong();
            long bi = sc.nextLong();
            long sum = ai+bi;
            bi_sum+=bi;
            List.add(sum);
        }
        Collections.sort(List);
        long sum_opt =0;
        sum_opt -=bi_sum;
        while(List.size()!=0){
            sum_opt+=List.get(0);
            List.remove(0);
            if(List.size()!=0) List.remove(0);
        }
        System.out.println(sum_opt);
    }
}