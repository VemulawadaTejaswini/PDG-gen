import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(in);
        long N=sc.nextLong();
        long M=sc.nextLong();
        long k=(M-2*N)/4;
        out.println(N+k);
    }
}