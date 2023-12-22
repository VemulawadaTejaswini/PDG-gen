import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 long X=sc.nextLong();
	     sc.close();
	     
	     long[] num=new long[121];
	     for(int i=0;i<121;i++)
	    	 num[i]=(long)Math.pow(i, 5);
	     
	     for(int i=0;i<num.length;i++) {
	    	 for(int j=0;j<num.length;j++) {
	    		 if(num[i]-num[j]==X) {
	    			 System.out.println(i+" "+j);
	    			 break;
	    		 }else if(num[i]+num[j]==X) {
	    			 System.out.println(i+" -"+j);
	    			 break;
	    		 }
	    	 }
	     }
	 }
}
