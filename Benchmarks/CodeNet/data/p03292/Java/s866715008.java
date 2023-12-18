import java.util.*;

class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    Integer[] array = new Integer[3];
	    for(int i = 0; i < 3; ++i) {
	        int tmp = sc.nextInt();
	        array[i] = tmp;
	    }
	    
	    Arrays.sort(array);
	    
	    int sum = Math.abs(array[0] - array[1]) + Math.abs(array[1] - array[2]);
	    
	    System.out.println(sum);
	}
}