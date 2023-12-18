import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String S;
        char[] ch = new char[11];
        
        S = sc.next();
        ch = S.toCharArray();
        for(int i=0;i<4;i++){
        	System.out.print(ch[i]);
        }
        System.out.print(" ");
        for(int i=4;i<12;i++){
        	System.out.print(ch[i]);
        }
        System.out.println();
    }
}