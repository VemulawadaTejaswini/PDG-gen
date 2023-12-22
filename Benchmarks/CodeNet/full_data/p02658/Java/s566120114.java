import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
      	int A = sc.nextInt();
    	Integer[] b = new Integer[A];
      	int c;
      	for(int i=0; i < A; i++){
        	b[i] = sc.nextInt();
        }
        for(i=0; i < A; i++){
        	c = c*b[i];
        }	
        System.out.println(c);
    }   
}
