import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
	
    	int c1 = 3;
    	int c2 = 6;
    	int c3 = 9;
    	
       	if((a * b) == c1 or c2 or c3) {
       		System.out.println("Yes");
       	} else {
       		System.out.println("No");
         }
        
        }
    }
