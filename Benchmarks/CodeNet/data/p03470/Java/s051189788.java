import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n];
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        System.out.println(set.size());
    }
}