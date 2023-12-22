import java.util.Scanner;

public class Main{
    public static int Cube(int x){
        return x*x*x;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Cube(n));
    }
}
