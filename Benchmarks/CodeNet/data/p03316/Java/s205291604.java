import java.util.*;
import java.io.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //test cases
        int n = in.nextInt();
        int sn =0;
        int temp = n;
        while(n>=10){
        sn = sn + n%10;
       // System.out.println(sn);
        n = n/10;
        }
        sn = sn +n;
        if(temp%sn==0) System.out.println("Yes");
        else System.out.println("No");
    }
}