
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;


        int n = sc.nextInt();

        int[] arr = new int[n] ;

        for (int i=0; i<n; i++) {
          arr[arr.length - i -1] = sc.nextInt() ;
        }

        for (int i=0; i<n; i++) {
          System.out.print(arr[i]);
          if(i!=n-1) System.out.print(" ");
          else System.out.print("\n");
        }

    }

}

