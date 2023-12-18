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
        while(List.size()!=0){
                long max = Collections.max(List3);
                int max_num=List3.indexOf(max);
                max = List.get(max_num);
                List.remove(max_num);
                List2.remove(max_num);
                List3.remove(max_num);
                sum1+=max;
                if(List.size()==0)break;
                long max2 = Collections.max(List3);
                int max_num2=List3.indexOf(max2);
                max2 = List2.get(max_num2);
                List.remove(max_num2);
                List2.remove(max_num2);
                List3.remove(max_num2);
                sum1-=max2;
        }
        System.out.println(sum1);
    }
}
