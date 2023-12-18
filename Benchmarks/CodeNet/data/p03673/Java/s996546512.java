import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        List<Integer> b = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            b.add(a[i]);
            Collections.reverse(b);
        }
        
        for(int i=0; i<n; i++){
            int s = b.get(i);
            System.out.print(s);
        }
        System.out.println("");
    }
}