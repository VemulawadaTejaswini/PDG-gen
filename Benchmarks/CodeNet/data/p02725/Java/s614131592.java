import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long k=cin.nextLong();
        int n=cin.nextInt();
        long num[]=new long[n];
        for(int i=0;i<n;i++){
            num[i]=cin.nextLong();

        }
        Arrays.sort(num);
        long sum=0;
        for(int i=1;i<n-1;i++){
            sum+=(num[i]-num[i-1]);
        }
        if(n>=2){
            if(k+num[0]-num[n-1]<num[n-1]-num[n-2]){
                sum+=k+num[0]-num[n-1];
        }
            else{
                sum+=num[n-1]-num[n-2];
            }
        }
        System.out.println(sum);
    }
}
