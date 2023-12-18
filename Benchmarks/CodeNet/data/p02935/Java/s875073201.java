import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> v = new ArrayList<>();
        for(int i = 0; i < N; i++){
            v.add(sc.nextInt());
        }
        Collections.sort(v);
        double result = 0;
        double prev = v.get(0);
        for(int i = 1; i < N; i++){
            result = ((double)prev + (double)v.get(i)) / 2.0;
            prev = result;
        }
        System.out.println(result);
    }
}
