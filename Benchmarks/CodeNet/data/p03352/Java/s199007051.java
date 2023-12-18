import java.util.*;
 
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
        int e = 0;
        for(int i = 1; i < num; i++){
        	for(int j = 1; j < num; j++){
            	if((Math.pow(i,j) <= num) && (e < Math.pow(i,j))){
                	e = (int)Math.pow(i,j);
                }
            }
        }
        System.out.println(e);
	}
}