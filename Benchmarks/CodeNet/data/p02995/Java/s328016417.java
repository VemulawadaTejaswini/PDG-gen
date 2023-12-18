import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long ba = (b-a+1);
        int count = 0;
        for(int i=0;i<ba-1;i++){
            long num = a + i;
          if(num-(Math.floorDiv(num,d)*d)!=0&&(num-Math.floorDiv(num,c)*c)!=0){
            count = count + 1;
          }
        }
        System.out.println(count);
	}
}
