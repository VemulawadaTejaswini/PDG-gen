import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        
        double Short = (double)(h * (360 / 12)) + (double)m * 1/2;

        double Long = (double)m * (360 / 60);

        double ang = (double)Math.abs(Long - Short);
        //System.out.println(ang);

        double ans = (double)a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(Math.min(ang, 360 - ang)));
        
        System.out.println(Math.sqrt(ans));
    
	}
}