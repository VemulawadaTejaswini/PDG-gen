import java.util.*;
import java.io.*;

public class Main {
    public static String[] part1(String cell){
    	return cell.split("00");
    }
    public static int[] part2(String cell){
    	String[] arrayOf1 = cell.sprit("0");
    	int[] array = new int[arrayOf1.length];
    	for(int i=0;i<arrayOf1.length;i++) array[i]=arrayOf1[i].length();
    	return array;
    }
    
    public static int operate(int[] cell){
    	if(cell.length<=1) return 0;
    	int[] next = new int[cell.length-1];
    	if(cell[0]>cell[cell.length-1]){
    		for(int i=0;i<next.length;i++) next[i]=cell[i+1];
    		next[0]--;
    		return operate(next)+cell[0];
    	}
    	else{
    		for(int i=0;i<next.length;i++) next[i]=cell[i];
    		next[next.length-1]--;
    		return operate(next)+cell[cell.length-1];
    	}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String cell = sc.nextLine();
        String[] part = part1(cell);
        int ans = 0;
        for(int i=0;i<part.length;i++){
        	ans += operate(part2(part[i]));
        }
        System.out.println(ans);
    }
}