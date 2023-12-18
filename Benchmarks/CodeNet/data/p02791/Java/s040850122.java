import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> P = new ArrayList<>();
        for(int i=0;i<N;i++)P.add(sc.nextInt());
        int sum=1;
        int now = P.get(0);
        for(int i=1;i<N;i++){
            if(now>=P.get(i)){
                sum++;
                now = P.get(i);
            }
        }
        System.out.println(sum);
    }
}
