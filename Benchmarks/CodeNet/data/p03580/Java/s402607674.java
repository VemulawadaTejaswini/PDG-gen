import java.util.*;
import java.io.*;

public class Main {
    //1100011010010110011 -> [11][1101][1011][11]
    public static String[] part1(String cell){
    	String[] separated = cell.split("00");
    	for(int i=0;i<separated.length;i++){
    		if(separated[i].startsWith("0")) separated[i]=separated[i].substring(1);
    		if(separated[i].endsWith("0")) separated[i]=separated[i].substring(0,separated[i].length()-1);
    	}
    	return separated;
    }
    
    //1110110101111 ->[3,2,1,4]
    public static int[] part2(String cell){//receive part1-ed String
    	String[] arrayOf1 = cell.split("0");
    	int[] array = new int[arrayOf1.length];
    	for(int i=0;i<arrayOf1.length;i++) array[i]=arrayOf1[i].length();
    	return array;
    }
    
    public static int[] cutFirst(int[] array, int c){
    	if(c>=array.length) return new int[]{};
    	int[] newArray = new int[array.length-c];
    	for(int i=0;i<newArray.length;i++) newArray[i]=array[i+c];
    	return newArray;
    }
    public static int[] cutLast(int[] array, int c){
    	if(c>=array.length) return new int[]{};
    	int[] newArray = new int[array.length-c];
    	for(int i=0;i<newArray.length;i++) newArray[i]=array[i];
    	return newArray;
    }
    
    public static int operate(int[] cell){
    	if(cell.length<=1) return 0;
    	if(cell[0]>cell[cell.length-1]){
    		int[] next;
    		if(cell[1]<=1) next = cutFirst(cell,2);
    		else{
    			next = cutFirst(cell,1);
    			next[0]--;
    		}
    		return cell[0]+operate(next);
    	}
    	else{
    		int[] next;
    		if(cell[1]<=1) next = cutLast(cell,2);
    		else{
    			next = cutLast(cell,1);
    			next[next.length-1]--;
    		}
    		return cell[cell.length-1]+operate(next);
    	}
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String cell = sc.nextLine();
        String[] part = part1(cell);
        long ans = 0;
        for(int i=0;i<part.length;i++){

        	ans += operate(part2(part[i]));
        }
        System.out.println(ans);
    }
}