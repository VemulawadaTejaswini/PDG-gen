import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        long X = s.nextLong();
        long A = 100;
        long i = 0;

        while(true){
            if(A >= X) break;
            A = A + A/100;
            i++;
        }

        System.out.println(i);
	}
} 