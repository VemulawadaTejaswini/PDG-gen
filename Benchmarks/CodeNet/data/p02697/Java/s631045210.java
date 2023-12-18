import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        int prev = 0;
        for(int i = 1; i <= m; i++){
            int first = (prev+1) % n;
            if(first == 0) first = n;
            while(hs.contains(first)){
                first = first == n ? 1 : first+1;
            }
            hs.add(first);
            int rival = (first+i) % n;
            if(rival == 0) rival = n;
            while(hs.contains(rival)){
                rival = rival == n ? 1 : rival+1;
            }
            hs.add(rival);
            System.out.println(first + " " +rival);
            prev = rival;
        }
    }
}
