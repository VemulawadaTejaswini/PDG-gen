import java.util.*;

public class Main{
	public static void main(String args[]){
    	    Scanner ren = new Scanner(System.in);
      		int n = ren.nextInt();//個数
      		int k = ren.nextInt();//人
      		
      		if (k == 1){
              System.out.println(n);
            }
              	if(k >= 1){
                	int total = n-k;
                  		System.out.println(total);
                }
    }

}