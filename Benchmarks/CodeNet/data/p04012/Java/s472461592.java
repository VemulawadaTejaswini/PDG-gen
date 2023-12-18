import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        int[] count = new int[26];
        for(int i=0;i<w.length();i++){
        	count[w.charAt(i)-'a']++;
        }
        for(int a=0;a<26;a++){
        	if(count[a]%2!=0){
        	    System.out.println("No");
        	    return;
        	}
        }
        System.out.println("Yes");
    }
}