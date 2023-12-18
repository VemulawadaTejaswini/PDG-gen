import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {

        int ans=0;
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        //int n=sc.nextInt(),m=sc.nextInt();
      //  String s=sc.next();
        ans=Math.min(a,b);
        String s="";
        for(int i=0;i<Math.max(a,b);i++)s+=ans;


        System.out.println(s);

    }

}
