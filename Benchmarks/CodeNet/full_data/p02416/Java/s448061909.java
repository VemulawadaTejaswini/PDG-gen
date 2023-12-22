import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       while(true){
           String x=sc.next();
           if(x.equals("0"))break;
           String[] X = x.split("", 0);
           int sum=0;
           for(int i=0;i<X.length;i++){
                int num = Integer.parseInt(X[i]);
                sum+=num;
           }
           System.out.println(sum);
       }
    }
}

