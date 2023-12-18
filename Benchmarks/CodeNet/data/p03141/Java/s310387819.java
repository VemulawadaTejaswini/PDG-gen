import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Long> List = new ArrayList<>();
        ArrayList<Long> List2 = new ArrayList<>();
        ArrayList<Long> List3 = new ArrayList<>();
        long sum1=0,sum2=0;
        for(int a=0;a<N;a++){
            List.add(sc.nextLong());
            List2.add(sc.nextLong());
            List3.add(List.get(a)-List2.get(a));
        }

        for(int a=0;a<N;a++){
            int k = List3.indexOf(Collections.min(List3));
            if(a%2==0){
                long max = Collections.max(List);
                long now = List.get(k);
                if(max==now){
                    sum1+=now;
                    List.remove(k);
                    List2.remove(k);
                    List3.remove(k);
                }
                else{
                    int max_num=List.indexOf(max);
                    sum1+=max;
                    List.remove(max_num);
                    List2.remove(max_num);
                    List3.remove(max_num);
                }
            }
            else{
               long max = Collections.max(List2);
               sum1-=max;
               int max_num = List2.indexOf(max);
               List.remove(max_num);
               List2.remove(max_num);
               List3.remove(max_num);
            }
        }
        System.out.println(sum1);
    }
}
