import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        //面積
        int area = a * b;
        //周囲
        int circumference = 2*(a+b);
        
        System.out.println(area + " " + circumference);
    }
}
