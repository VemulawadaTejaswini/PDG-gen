import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N  =sc.nextInt();
        int num = N/2;
        float opt;
        if(N%2==0) opt = (float)num/N;
        else opt = (float)(num+1)/N;
        System.out.println(opt);
    }
}