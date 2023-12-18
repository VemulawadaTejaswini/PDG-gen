import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int ab=b-a;
        int bc=c-b;
        int ac=c-a;

        int rab=Math.abs(ab);
        int rbc=Math.abs(bc);
        int rac=Math.abs(ac);

        if((rac<=d)||(rab<=d&&rbc<=d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}