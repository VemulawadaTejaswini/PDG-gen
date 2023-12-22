// "static void main" must be defined in a public class.
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int D=in.nextInt();
        int T=in.nextInt();
        int S=in.nextInt();
        double t=(double)(D)/(double)(S);
        if(t<=(double)T)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}