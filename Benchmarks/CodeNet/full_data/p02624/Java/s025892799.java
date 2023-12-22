import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int tmp=1;
        for(int i=2;i<=n;i++){
            for(int s=1;s<=i;s++)if(i%s==0)tmp+=i;
        }
        System.out.println(tmp);
    }
}