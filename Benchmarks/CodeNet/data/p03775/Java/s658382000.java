import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        long N = sc.nextLong();
        long k =N;
        long i=2;
        long a=1;
        long b=1;
        while(k!=1){
            if(k % i ==0){
              k = k/i;
if(a<(b*i*10)){
    a=a*b;
    b=1;
}if(b<(a*i*10)){
                    b=b*a;
                    a=1;
                }
            if(a<b){
                a= a*i;
            }else{

                b= b*i;

            }
            }else{
                i++;
            }
        }
        int valLena = String.valueOf( a ).length();
        int valLenb = String.valueOf( b ).length();
        if(valLena<valLenb){
            System.out.println(valLenb);
        }else{

            System.out.println(valLena);
        }
    }
    }