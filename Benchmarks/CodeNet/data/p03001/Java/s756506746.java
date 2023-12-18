import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt();
        int h=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print(((double)(w*h)/2.0)+" ");
        System.out.println(x*2==w&&y*2==h?1:0);

    }


}