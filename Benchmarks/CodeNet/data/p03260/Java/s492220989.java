import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
      	int c = sc.nextInt();

        int a1 = a*b*c;
        int b1 = a*b*c;        		
        int c1 = 3;
        int c2 = 6;
        int c3 = 9;
        
        
       	if( a1*b1 == c1 ) {
       		System.out.println("Yes");
       	}else if( a1*b1 == c2 ) {
           		System.out.println("Yes");
       	}else if( a1*b1 == c3 ) {
       		System.out.println("Yes");
       	} else {
       		System.out.println("No");
         }
        
        }
    }
