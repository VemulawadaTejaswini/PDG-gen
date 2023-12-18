import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  a = s.nextInt();
        int  b = s.nextInt();
        int  x = s.nextInt();

        if(a<=x&&x<=a+b){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
    }
}
