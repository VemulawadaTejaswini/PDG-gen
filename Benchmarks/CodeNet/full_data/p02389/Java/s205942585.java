import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int square = h*w;
        int circuit = 2*(h+w);
        System.out.println(square+" "+circuit);
    }
}