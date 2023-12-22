import java.util.*;

public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt()/200;
	    int ans=0;
	     switch(x) {
	     case 2: 
	    	 ans=8;
	    	 break;
	     case 3:
	    	 ans=7;
	    	 break;
	     case 4:
	    	 ans=6;
	    	 break;
	     case 5:
	    	 ans=5;
	    	 break;
	     case 6:
	    	 ans=4;
	    	 break;
	     case 7:
	    	 ans=3;
	    	 break;
	     case 8:
	    	 ans=2;
	    	 break;
	     case 9:
	    	 ans=1;
	    	 break;
	    	 
	     }
	   System.out.println(ans);

	    
	}
}
