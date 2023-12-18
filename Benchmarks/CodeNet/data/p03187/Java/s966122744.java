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
        String[] ln = br.readLine().split(" ");
        int l = Integer.parseInt(ln[0]);
        int n = Integer.parseInt(ln[1]);
        long[] xs = new long[(int)n+1];
        boolean[] burned = new boolean[(int)l];
        int current = 0;
        
        xs[0] = 0;
        for (int i = 1; i < n+1; i++) {
            xs[i] = Long.parseLong(br.readLine());
            //System.out.println(xs[i]);
        }
        
        burned[0] = true;
        for (int i = 1; i < l; i++) {
            for (int j = 1; j < n+1; j++) {
                if (i == xs[j]) {
                    burned[i] = false;
                    break;
                }
                else burned[i] = true;
            }
        }
        
        /*for (int i = 0; i < l; i++) {
            System.out.println(burned[i]);
        }*/
        long[] ans = new long[(int)n+1];
        ans[0] = 0;
        
        ans[1] = Math.max(ans[0] + 2-current, ans[0] + current-9+l);
        
        int a = 0, b = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < l; j++) {
                if (burned[(current+j<l?current+j:current+j-l)] == false) {
                    a = (current+j<l?current+j:current+j-l);
                    //burned[(current+j<l?current+j:current+j-l)] = true;
                    break;
                }
            }
            for (int j = 1; j < l; j--) {
                if (burned[(current-j>=0?current-j:current-j+l)] == false) {
                    b = (current-j>0?current-j:current-j+l);
                    //burned[(current-j>0?current-j:current-j+l)] = true;
                    break;
                }
            }
            ans[i] = Math.max(ans[i-1] + (a-current>=0?a-current:a-current+l), ans[i-1] + (current-b>=0?current-b:current-b+l));
            current = a-current>current-b?a:b;
            burned[current] = true;
        }
        
        System.out.println(ans[n]);
        
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
