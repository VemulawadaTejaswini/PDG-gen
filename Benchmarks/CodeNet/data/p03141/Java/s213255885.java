import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> List = new ArrayList<>();
        ArrayList<Long> List2 = new ArrayList<>();
        ArrayList<Long> List3 = new ArrayList<>();
        long sum1=0;
        for(int a=0;a<N;a++){
            List.add(sc.nextLong());
            List2.add(sc.nextLong());
            List3.add(List.get(a)-List2.get(a));
        }

        for(int a=0;a<N;a++){
            if(a%2==0){
                long max = Collections.max(List3);
                int max_num=List3.indexOf(max);
                max = List.get(max_num);
                List.remove(max_num);
                List2.remove(max_num);
                List3.remove(max_num);
                sum1+=max;
            }
            else{
                long max = Collections.max(List3);
                int max_num=List3.indexOf(max);
                max = List2.get(max_num);
                List.remove(max_num);
                List2.remove(max_num);
                List3.remove(max_num);
                sum1-=max;
            }
        }
        System.out.println(sum1);
    }
}
