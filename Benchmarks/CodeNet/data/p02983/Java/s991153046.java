import java.util.*;

import static java.lang.Math.round;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int modl =   l% 2019;
        int modr = r%2019;
        long ans =2018;

        if(modr<= r-l){
            System.out.println(0);
        }else{
            for(int p=modl; p < modr; p++){
                for(int q=p+1; q <= modr; q++){
                    ans = Math.min(ans, (p*q)%2019);

                }
            }
            System.out.println(ans);

        }






        }
    }