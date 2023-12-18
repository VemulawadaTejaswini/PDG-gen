import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Integer k = scan.nextInt();
        Long array[] = new Long[n];
        
        for(int i=0;i<n;i++)
            array[i] = scan.nextLong();
        Arrays.sort(array,Collections.reverseOrder());

        //for(long i : array)
          //  System.out.println(i);

        long count = 0;
        for(int i=0;i<n;i++){
            if(k > 0){
                k--;
            }else{
                count += array[i];
            }
        }

        System.out.println(count);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
      }
}