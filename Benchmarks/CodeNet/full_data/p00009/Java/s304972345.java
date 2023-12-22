import java.util.Arrays;
import java.util.Scanner;

public class Main {	
	public static void main(String [] a){
    	 Scanner sn = new Scanner(System.in);
    	 while(sn.hasNext()==true){
    	 int n[] = new int[1000000];
    	 Arrays.fill(n,1);
    	 n[0]=n[1]=0;
    	 
    	 int m = sn.nextInt();
    	 int sum=0;
    	 
    	 for(int i=2;i<=m;i++){
    		 for(int j=2;j<i;j++){
    			 if((i%j)==0){
    				 n[i]=0;
    			 }
    		 }
    		 sum += n[i];
    	 }
    	 System.out.println(sum);
     }
	}
}