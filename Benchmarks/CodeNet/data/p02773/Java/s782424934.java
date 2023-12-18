/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		String s;
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0;i<n;i++) {
		    str[i] = new String();
		    s = sc.next();
		    str[i] = s;
		}
		for(String i: str) {
		    Integer j = hm.get(i);
		    hm.put(i, (j==null)?1:j+1);
		}
		int x=(Collections.max(hm.values()));  // max value in the Hashmap
      // Itrate through hashmap
        for (Map.Entry<String, Integer> ent : hm.entrySet()) {  
            if (ent.getValue()==x) {
                System.out.println(ent.getKey());     
            }
        }
	}
}
