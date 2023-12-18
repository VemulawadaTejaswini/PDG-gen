import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
	    int b = '+';
        int c = '-';
        int takahashi1 = 0;
        int takahashi2 = 0;
        int result = 0;

           if(b == a) {
        	   takahashi1++;
           }else if(c == a) {
        	   takahashi2--;
           }
           result += takahashi1 + takahashi2;

           System.out.println(result);


        }
           }

