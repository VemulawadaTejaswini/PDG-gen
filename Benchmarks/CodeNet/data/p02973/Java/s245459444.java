import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Color> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
		    Color x = new Color(n - i, sc.nextInt());
		    Color target = set.lower(x);
		    if (target != null) {
		        set.remove(target);
		    }
		    set.add(x);
		}
		System.out.println(set.size());
	}
	
	static class Color implements Comparable<Color> {
	    int idx;
	    int value;
	    
	    public Color (int idx, int value) {
	        this.idx = idx;
	        this.value = value;
	    }
	    
	    public int hashCode() {
	        return idx;
	    }
	    
	    public int compareTo(Color another) {
	        if (value == another.value) {
	            return idx - another.idx;
	        } else {
	            return value - another.value;
	        }
	    }
	    
	    public boolean equals(Object o) {
	        Color another = (Color)o;
	        return idx == another.idx && value == another.value;
	    }
	}
}
