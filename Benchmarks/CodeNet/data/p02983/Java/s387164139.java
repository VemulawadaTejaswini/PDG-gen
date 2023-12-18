import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        long l=sc.nextInt();
        long r=sc.nextInt();
        long x=0;
        long ans=0;
        for (int i=0;x<=r;i++){
            x=i*2019L;
            if (x>=l && x<=r){
                ans=0;
                break;
            }else if (x<l){
                ans=Math.min(l*(l+1),r*(r-1));
            }
        }
        System.out.println(ans%2019);


    }

}

