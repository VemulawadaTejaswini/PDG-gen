import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        List<String> b = new ArrayList<String>();
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            b.add(a[i]);
            Collections.reverse();
        }
        
        for(int i=0; i<n; i++){
            int s = new int(b.get(i));
            System.out.print(s);
        }
        System.out.println("");
    }
}