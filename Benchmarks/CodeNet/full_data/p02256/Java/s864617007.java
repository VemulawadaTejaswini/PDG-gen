import java.io.*;
import java.util.*;
public class Main
{
            public static void main(String args[]) throws Exception
            {
                    Scanner cin=new Scanner(System.in);
                    int a=cin.nextInt(),b=cin.nextInt();
                    System.out.println(GCD(a,b));
            }
					public static  int GCD(int a, int b) {
						if (b==0) return a;
						return GCD(b,a%b);
					}
}
