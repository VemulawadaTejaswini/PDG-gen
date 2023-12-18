import java.util.*;
public class Main {
    public static void main(String[]$){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int ans1=(int)1e9+4;
        int ans2=(int)1e9+4;
        int ans3=(int)1e9+4;
        int ans4=(int)1e9+4;
        if(-x<=-y)ans1=-y+x;
        if(-x<=y)ans2=y+x;
        if(x<=y)ans3=y-x;
        if(x<=-y)ans4=-y-x;
        System.out.println(Math.min(Math.min(ans1,ans2),Math.min(ans3,ans4)));
    }
}