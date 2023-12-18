import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0 ; i < 5; i++) {
            list.add(scan.nextInt());
        }
        int min = Collections.min(list);
        int p = n / min;
        System.out.println(n + p);
    }
}
