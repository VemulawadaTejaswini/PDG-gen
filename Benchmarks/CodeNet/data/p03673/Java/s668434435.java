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
            b[0] =  a[i];
            Collections.reverse();
        }
        
        for(int i=0; i<n; i++){
            System.out.print(i[0]);
        }
        System.out.println("");
    }
}