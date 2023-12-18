import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long a = sc.nextLong();
      long b = sc.nextLong();
      long c = sc.nextLong();
      long d = sc.nextLong();
      long num=0;
      for(long i=a;i<=b;i++){
        if(i%c!=0 && i%d!=0) num++;
      }
        System.out.println(num);
    }

}
