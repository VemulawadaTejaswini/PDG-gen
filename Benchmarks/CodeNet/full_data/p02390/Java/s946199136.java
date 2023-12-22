import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int h = S/3600;
        S %= 3600;
        int m = S/60;
        S %= 60;
        System.out.println(h+":"+m+":"+s);
    }
}
