import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private static final int MAX = 101;
    
    public static void main(String[] args) {
        int[] ary = new int[MAX];
        setValue(ary);
        printMode(ary, getMaxValue(ary));
    }
    
    public static void setValue(int[] ary) {
        while(scn.hasNextInt()) {
            ary[scn.nextInt()]++;
        }
    }
    
    public static int getMaxValue(int[] ary) {
        int[] buf = Arrays.copyOf(ary, ary.length);
        Arrays.sort(buf);
        return buf[ary.length - 1];
    }
    
    public static void printMode(int[] ary, int max) {
        for(int i = 1; i < ary.length; i++) {
            if(ary[i] == max) {
                System.out.println(i);
            }
        }
    }
}