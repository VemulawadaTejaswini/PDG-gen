import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m<20)System.out.println(0);
        else{
            int ans=0;
            for(int i=20;i<=m;i++){
                int po=i%10;
                int popo=i/10;
                if(po*popo<=n&&2<=po*popo&&po>=2){
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
