import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collections;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        
        boolean matched;
        String ans = "UNRESTORABLE";;
        for (int i = s.length()-t.length(); i >= 0; i--) {
            //System.out.println(i);
            matched = true;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i+j) == t.charAt(j) || s.charAt(i+j) == '?') continue;
                else {
                    matched = false;
                    //ans = "UNRESTORABLE";
                    break;
                }
            }
            if (matched) {
                ans = s.substring(0, i) + t;
                //System.out.println(i);
                //ans.replace("?", "a");
                break;
            }
        }
        
        System.out.println(ans.replace("?", "a"));
    }
}

class Box {
    int w;
    int h;
    public Box(int w, int h) {
        this.w = w;
        this.h = h;
    }
}

class BoxComparator1 implements Comparator<Box>{
	public int compare(Box b1, Box b2) {
		return b1.w - b2.w;
	}
}

class BoxComparator2 implements Comparator<Box> {
    public int compare(Box b1, Box b2) {
        return b1.h - b2.h;
    }
}
