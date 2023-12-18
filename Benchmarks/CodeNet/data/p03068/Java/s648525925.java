import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] c = str.toCharArray();
        int K = sc.nextInt();
        //int[] p = new int[N];
        //a[0] = Character.getNumericValue(str.charAt(0));
        //boolean test = false;
        
        for(int i=0; i<N; i++){
            if(c[K-1] != c[i]){
                c[i] = '*';
            }
            //System.out.println(count);
        }
        for(int i=0; i<N; i++){
            System.out.print(c[i]);
        }
        System.out.println("");
    }
}
