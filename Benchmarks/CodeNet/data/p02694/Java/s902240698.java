import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            long X = sc.nextLong();
            long goal = 100;
            int count = 0;
        	double av = 0;
            while(goal < X){
              	av = goal / 100;
                goal = goal + (long)(av);
                count++;
            }
            System.out.println(count);
          }
}