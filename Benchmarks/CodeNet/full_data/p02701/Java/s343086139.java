import java.util.*;

public class Main {


    public static void main(String[] args) {
        int r =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(sc.next());
        }
        System.out.println(hs.size());
    }
}