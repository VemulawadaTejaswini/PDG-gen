import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x=sc.nextLong(),y=sc.nextLong();
        int ans=0;
        do{
            ans++;
            x*=2;
        }while(x<=y);
        System.out.println(ans);
    }

}
