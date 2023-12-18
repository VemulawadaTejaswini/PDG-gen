import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Map<Integer,Integer> a = new TreeMap<>();
        for(int i = 1;i<n+1;i++){
            a.put(i,Integer.parseInt(sc.next()));
        }
        for(Integer num: a.values){
            System.out.println(num);
        }
    }
}
