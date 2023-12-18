import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long one = sc.nextLong();
            long zero = sc.nextLong();
            long minus = sc.nextLong();
            long nums = sc.nextLong();
            if(one >= nums){
              System.out.println(nums);
            } else if(one + zero >= nums){
              System.out.println(one);
            } else {
              System.out.println(one + ((nums-one-zero)*-1));
            }
          }
        }