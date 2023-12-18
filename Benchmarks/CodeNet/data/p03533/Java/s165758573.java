import java.util.*;
import java.io.*;

public class Main {
    
    public static boolean solve(String s){
    	Set<String> possible = new HashSet<String>();
    	possible.add("KIHBR");
    	possible.add("KIHBRA");
    	possible.add("KIHBAR");
    	possible.add("KIHBARA");
    	possible.add("KIHABR");
    	possible.add("KIHABRA");
    	possible.add("KIHABAR");
    	possible.add("KIHABARA");
    	possible.add("AKIHBR");
    	possible.add("AKIHBRA");
    	possible.add("AKIHBAR");
    	possible.add("AKIHBARA");
    	possible.add("AKIHABR");
    	possible.add("AKIHABRA");
    	possible.add("AKIHABAR");
    	possible.add("AKIHABARA");
    	
    	return possible.contains(s);
    	
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String given = sc.next();
        
        System.out.println(solve(given) ? "YES" : "NO");
        
    }
}