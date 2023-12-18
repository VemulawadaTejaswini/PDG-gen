import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Long a[] = new Long[n];
        
        for(int i=0;i<n;i++){
            long l = scan.nextLong();
            a[i] = l;
        }

        Arrays.sort(a);

        System.out.print(a[n-1] + " ");
        System.out.println(a[((n-1)/2)]);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}