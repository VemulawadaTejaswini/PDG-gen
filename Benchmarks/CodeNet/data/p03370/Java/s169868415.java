import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int tmp;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
          tmp=sc.nextInt();
          min=Math.min(min,tmp);
          x-=tmp;
        }
        System.out.println(n+x/min);
    }
}