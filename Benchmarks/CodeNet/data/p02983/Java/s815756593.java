import java.util.*;

import static java.lang.Math.round;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int modl =   l% 2019;
        int modr = r%2019;
        if(modr<= r-l||modr==0){
            System.out.println(0);
        }else{

            System.out.println((modl*(modl+1))%2019);
        }






        }
    }