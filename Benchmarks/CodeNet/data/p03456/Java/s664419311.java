import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int c = Integer.parseInt((a+b));
        int d = (int)Math.sqrt(c);
        if(d*d==c) System.out.println("Yes");
        else System.out.println("No");
    }
}