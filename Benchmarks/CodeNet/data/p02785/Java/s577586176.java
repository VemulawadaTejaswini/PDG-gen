import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long sum =0;
        ArrayList<Integer> H = new ArrayList<>();
        for(int i=0;i<N;i++) H.add(sc.nextInt());
        Collections.sort(H,Comparator.reverseOrder());
        for(int i=K;i<H.size();i++) sum+=H.get(i);
        System.out.println(sum);
    }
}