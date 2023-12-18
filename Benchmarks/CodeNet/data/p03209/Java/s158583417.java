import java.util.*;

public class Main {
 	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();
	    System.out.println(new Barger(n).getCount(x));
   }
   
   static class Barger {
       Barger under;
       int level;
       long size;
       long value;
       
       public Barger(int level) {
           this.level = level;
           if (level == 0) {
               size = 1;
               value = 1;
           } else {
               under = new Barger(level - 1);
               size = under.size * 2 + 3;
               value = under.value * 2 + 1;
           }
       }
       
       public long getCount(long idx) {
           if (level == 0) {
               return 1;
           }
           if (idx < 2) {
               return 0;
           }
           idx--;
           long ans = 0;
           if (idx <= under.size) {
               return under.getCount(idx);
           }
           idx -= under.size;
           ans += under.value;
           if (idx <= 1) {
               return ans + 1;
           }
           idx--;
           ans++;
           if (idx <= under.size) {
               return ans + under.getCount(idx);
           }
           return value;
       }
   }
}


