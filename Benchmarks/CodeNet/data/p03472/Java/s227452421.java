import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h = sc.nextInt();
		Sord[] sords = new Sord[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
		    sords[i] = new Sord(sc.nextInt(), sc.nextInt());
		    max = Math.max(max, sords[i].small);
		}
		Arrays.sort(sords);
		int count = 0;
		for (int i = 0; i < n; i++) {
		    if (sords[i].big <= max) {
		        break;
		    }
		    h -= sords[i].big;
		    count++;
		    if (h <= 0) {
		        break;
		    }
		}
		if (h > 0) {
		    count += (h + max - 1) / max;
		}
        System.out.println(count);
   }
   
   static class Sord implements Comparable<Sord> {
       int small;
       int big;
       
       public Sord(int small, int big) {
           this.small = small;
           this.big = big;
       }
       
       public int compareTo(Sord another) {
           return another.big - big;
       }
   }
}


