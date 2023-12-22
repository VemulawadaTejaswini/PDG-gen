import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
    Scanner scan = new Scanner(System.in);
    
    int[] m = new int[10];
    for (int i =0 ; i<10 ;i++)
        m[i] = scan.nextInt();
        
    Arrays.sort(m);
    for( int i=9;i>=7;i--)
    System.out.println(m[i]);
    
    }
}