
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long[] ironbar = new long[N+1];
        long[] iron = new long[N+1];
        for (int i = 0; i < N; i++) {
            long num = sc.nextInt();
            ironbar[i+1] = num;
            iron[i+1] = iron[i] + num;
        }
        // System.out.println(Arrays.toString(iron));
        // System.out.println(Arrays.toString(iron));
        long sum =  iron[N];
        long half = sum/2+sum%2;
        int mid = N;
        for (int i = 0; i <= N; i++) {
            if(half <= iron[i]){
                mid=i;
                break;
            }
        }
        if(Math.abs(iron[mid-1]-half) < Math.abs(iron[mid]-half) ){
            mid=mid-1;
        }
        // System.out.println(iron[mid]);        
        long left = iron[mid];
        long right = iron[N]-iron[mid];
        // System.out.println(left);        
        // System.out.println(right);
        System.out.println(Math.abs(left-right));
    }
}