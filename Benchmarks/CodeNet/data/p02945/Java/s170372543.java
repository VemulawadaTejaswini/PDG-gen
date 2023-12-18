import java.util.*;
	public class Main{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = compare(a+b,a-b);
        System.out.println(compare(c,a*b));
      }
      static int compare(int a,int b){
        if(a>=b)return a;
        else return b;
      }
    }
