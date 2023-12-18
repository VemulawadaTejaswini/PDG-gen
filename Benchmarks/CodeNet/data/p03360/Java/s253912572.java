import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int b = in.nextInt();
        
        int c = in.nextInt();
        
        int N = in.nextInt();
        
        int max;

        int sum = a + b + c;
        
        max = a<b? b:a;
        max = max<c?c:max;
        
        sum -= max;

        for(int i=0;i<N;i++)
        	max*=2;
        
        System.out.println(sum + max);

        in.close();
    }

}
