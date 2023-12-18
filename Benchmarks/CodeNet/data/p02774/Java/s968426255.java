import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        ArrayList<Long> list = new ArrayList<Long>();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = i +1; j < n; j++){
                list.add(((long)a[i] * (long)a[j]));
            }
        }
        Collections.sort(list);
        System.out.println(list.get(k -1));
        
    }
}
