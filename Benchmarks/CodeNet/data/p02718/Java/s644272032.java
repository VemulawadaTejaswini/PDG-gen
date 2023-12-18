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
    public static boolean gcd(int a,int b){
        if(a==1||b==1){
            return false;
        }
        while(1>0){
            int t = a%b;
            if(t == 0){
                break;
            }
            else{
                a=b;
                b=t;
            }

        }
        if(b>1)	return true;
        else{
            return  false;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int m=cin.nextInt();
        int num[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            num[i]=cin.nextInt();
            sum+=num[i];
        }
        int vote=sum/(4*m);
        Arrays.sort(num);
        int m1=0;
        for(int i=n-1;i>=0;i--){
            if(num[i]>vote){
                m1++;
            }
        }
        if(m1>=m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}