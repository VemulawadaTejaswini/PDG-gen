import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        while(x>0||y>0){
            int ans=0;
            for(int bit =0;bit<(1<<10);bit++){
                int cnt=0;
                int sum=0;
                for(int i=0;i<10;i++){
                    if((1 & (bit>>i))==1){
                        sum+=i;
                        cnt++;
                    }
                }
                if(cnt==x && sum==y){
                    ans++;
                }
            }
            System.out.println(ans);
            x=scan.nextInt();
            y=scan.nextInt();
        }
    }
}
