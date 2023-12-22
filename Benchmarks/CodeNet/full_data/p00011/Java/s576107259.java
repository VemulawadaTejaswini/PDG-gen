import java.io.IOException;
import java.util.Scanner;

public class Main  {

    static void swapidx(int[] arr, int lhs, int rhs){
    	int tmp = arr[lhs];
    	arr[lhs] = arr[rhs];
    	arr[rhs] = tmp;
    	return;
    }
    
    public static void main(String [] args){
    	Scanner sc = new Scanner(System.in);
    	int w = sc.nextInt();
    	int n = sc.nextInt();

    	int[] lines = new int[w];
    	for(int i=0; i<lines.length;++i){
    	    lines[i] = i + 1;
    	}
	sc.nextLine();
    	for(int i=0; i<n;++i){
	    String line = sc.nextLine();
	    String[] ints = line.split(",");
	    // System.out.println(line);
	    int a = Integer.parseInt(ints[0]);
	    int b = Integer.parseInt(ints[1]);
	    swapidx(lines, a - 1, b - 1);
    	}
	for(int i=0; i<lines.length;++i){
	    System.out.println(lines[i]);
	}
    }

}