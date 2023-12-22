import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
       while(true){
        long  x=sc.nextInt();
        if(x==0)break;
        boolean can=true;
        long  sum=0;
        while(can){
            if(x<10){
                sum+=x;
                System.out.println(sum);
                can=false;
            }
            else{
                sum+=x%10;
            x=(x-x%10)/10;
            }
        }
      }
    }
}
