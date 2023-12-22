import java.util.*;
class Main{
	public static void main{String args[]}{
    		Scanner sc = new Scanner(System.in);
      		int i = sc.nextInt();
      		int rem = i % 1000;
      		int ret = 1000-rem;
      		if(ret == 1000){
            	ret = 0;
            }
      		System.out.println(ret);
    	}
}