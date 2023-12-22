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
        int n = Integer.parseInt(br.readLine());
        int[] as = new int[n];
        
        for (int i = 0; i < n; i++) {
            as[i] = Integer.parseInt(br.readLine());
        }
        
        int max = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            int latest = as[i];
            count = 1;
            for (int j = i+1; j < n; j++) {
                if (as[j] > latest) {
                    count++;
                    //System.out.println("aaa");
                    latest = as[j];
                }
            }
            if (count > max) max = count;
        }
        System.out.println(max);
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

