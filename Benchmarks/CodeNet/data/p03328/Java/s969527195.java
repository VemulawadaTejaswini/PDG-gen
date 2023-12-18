// Don't place your source in a package
import java.util.*;
import java.lang.*;
import java.io.*;

// Please name your class Main
class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		ArrayList<Integer> towers = new ArrayList<>();
		int i=1,j=1;
		towers.add(0);
		for(;i<1000;i++)
            towers.add(towers.get(i-1)+i);
        
        for(i=1;i<1000 && towers.get(i)<m;i++)  ;
        for(j=1;j<1000 && towers.get(j)<n;j++)  ;
        Set <Integer> fori = new HashSet<>();
        Set <Integer> forj = new HashSet<>();
        for(;i<1000;i++)
            fori.add(towers.get(i)-m);
        for(;j<1000;j++)
            forj.add(towers.get(j)-n);
        fori.retainAll(forj);
        for(Integer ans:fori)
            System.out.println(ans);
	}
}