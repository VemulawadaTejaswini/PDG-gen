import java.util.*;
import java.lang.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        if(N==1)  N = 1;
        if(N>=2 &&N<3)   N = 2;
        if(N>=4 &&N<7)   N = 4;
        if(N>=8 &&N<15)  N = 8;
        if(N>=16&&N<31)  N = 16;
        if(N>=32&&N<63)  N = 32;
        if(N>=64&&N<101) N = 64;
        
        System.out.print(N);

        System.out.println();
    }

}