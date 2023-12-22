
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
     int a= sc.nextInt();
     double sum=1;
     while(a--!=0){
       double x=sc.nextDouble();
         sum*=x;
    }

     if(sum>1e18) System.out.println(-1);
     else System.out.println((long)sum);
    }
}