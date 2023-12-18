import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long m=1;
        long ans=0;
        while(true){
            if(m>(n-m)/m){
                System.out.println(ans);
                return;
            }else if((n-m)%m==0){
                ans+=(n-m)/m;
            }
            m++;
        }
    }
}