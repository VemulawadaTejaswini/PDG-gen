import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
    	
    	Scanner sc = new Scanner(System.in);
    	Integer array[];
    	array = new Integer[10];	
    	
        for (int i=0; i<10; i++) {
            Integer mountain = sc.nextInt();
            array[i] = mountain;
        }
        
        Arrays.sort(array, Comparator.reverseOrder());
        for (int j=0; j<3; j++){
        System.out.println(array[j]);
        }
    }
}