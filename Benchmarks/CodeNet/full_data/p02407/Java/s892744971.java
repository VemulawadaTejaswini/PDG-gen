import java.util.*;

public class Main{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        int a[] = new int[number];
	        for(int i = 0; i < number;i++){
	            a[i] = sc.nextInt();
	        }
	        for(int j = number-1;j >= 0;j--) {
	        	System.out.print(a[j]);
	        	if(j != 0){
	        	    System.out.print(" ");
	        	}
	        }
	        System.out.println();
    }
}
