import java.util.*;
class Main{ 
public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        long N=scn.nextInt();
  		long sum=0; 
        for (int i = 0; i <N; i++) {
           sum+=i;
        }
        System.out.println(sum);
    }
}