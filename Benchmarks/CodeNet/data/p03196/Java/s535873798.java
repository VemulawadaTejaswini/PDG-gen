import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        double p=sc.nextDouble();
        long x=(long)Math.pow(p,1/n);
        long output=0;
        for(long i=0;i<x;i++){
            if(p%Math.pow(i+1, n)==0){
                output=i+1;
            }
        }
        System.out.println(output);
        

    }

}