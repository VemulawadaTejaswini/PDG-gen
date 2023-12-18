import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> group1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        List<Integer> group2 = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
        List<Integer> group3 = new ArrayList<>(Arrays.asList(2));
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean k1 = group1.contains(a);
        boolean k2 = group2.contains(a);
        boolean k3 = group3.contains(a);
        boolean l1 = group1.contains(b);
        boolean l2 = group2.contains(b);
        boolean l3 = group3.contains(b);
        String ans = ((k1 && l1) || (k2 && l2) || (k3 && l3))? "YES" : "NO";
        System.out.println(ans);
    }    
}