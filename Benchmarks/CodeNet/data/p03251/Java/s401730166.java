import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(n+" ");
        System.out.print(m+" ");
        System.out.print(x+" ");
        System.out.println(y);

        int[] xAr = new int[n];
        int[] yAr = new int[m];
        for (int i=0;i < n ;i++ ) {
            xAr[i] = Integer.parseInt(sc.next());
        }
        for (int i=0;i < m ;i++ ) {
            yAr[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(xAr);
        Arrays.sort(yAr);
        
        if(yAr[0] <= x){
            System.out.println("War");
        }else if(xAr[n-1] >= y){
            System.out.println("War");
        }else if(xAr[n-1]>yAr[0] ) {
            System.out.println("War");
        }else{
            System.out.println("No War");
        }
    }
}