import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = in.next(), s = "";
        for (int i = 0; i < a; i++)
            s += b;
        System.out.printf("%s\n", s);
        in.close();
    }
}
