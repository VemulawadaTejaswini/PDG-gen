import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Long x[] = new Long[n];
        Long x2[] = new Long[n];
        
        for(int i=0;i<n;i++){
            long l = scan.nextLong();
            x[i] = l;
            x2[i] = l;
        }

        Arrays.sort(x2);

        for(int i=0;i<n;i++){
            if(x2[x2.length/2] <= x[i]){
                System.out.println(x2[x2.length/2-1]);
            }else{
                System.out.println(x2[x2.length/2]);
            }
        }
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}