import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        int A =scanner.nextInt();
        int B =scanner.nextInt();
        int min = 0;
        int max = 0;


        if(A+B>=N){
            min = max(A,B)-min(A,B);
            max = min(A,B);
        }
        else{
            min = 0;
            max = min(A,B); 
        }

        System.out.println(max + " " + min);
     
        scanner.close();

    }
    public static int POWER(int a,int b){
        int p = 1;
        for(int i = 1;i<=b;i++){
            p = a*p;
        }
        return p;
    }
    public static int min(int a,int b){
        if(a>=b) return b;
        else return a;
      }
    public static int max(int a,int b){
        if(a>=b) return a;
        else return b;
      }
    public static int abs(int a){
        if(a>=0) return a;
        else return -1*a;
      }
}