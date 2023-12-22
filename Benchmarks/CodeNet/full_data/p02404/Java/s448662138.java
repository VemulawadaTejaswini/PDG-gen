import java.util.*;
import java.lang.*;
import java.io.*;
 
class Main
{
	//  W <= 300
	private static
	char[] sh = "##############################################################################################################################################################################################################################################################################################################"
		.toCharArray();
	private static
	char[] dt = ".............................................................................................................................................................................................................................................................................................................."
		.toCharArray();
	private static 
	char[] nl = System.getProperty("line.separator").toCharArray();
    public static void main (String[] args) throws java.lang.Exception
    {
    	char[] sh = Main.sh;
    	char[] dt = Main.dt;
    	char[] nl = Main.nl;
        StringBuilder
            p = new StringBuilder(1000),
            k = new StringBuilder(100);
        Scanner r = new Scanner(System.in);
        int h, w;
        while (0 != ((h = r.nextInt()) | (w = r.nextInt()))) {
            p.append(sh, 0, w).append(nl);
            k.setLength(0);
            k.append('#').append(dt, 0, w - 2).append('#').append(nl);
            while (2 != h--) {
                p.append(k);
            }
            p.append(sh, 0, w).append(nl).append(nl);
        }
        System.out.print(p);
    }
}