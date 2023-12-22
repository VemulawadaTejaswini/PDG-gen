import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		int s,i=0,j;
		int[] x = new int[50];
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
        	s = scan.nextInt();
       	
        	x[i] = sum4(s);
        	
        	i++;
        
        }
        for(int p : x){
        	System.out.println(p);
        }
    }
    
    public static int sum4(int k){
    	int count = 0,sum;
    	for(int a=0;a<=9;a++){
    		for(int b=0;b<=9;b++){
    			for(int c=0;c<=9;c++){
    				for(int d=0;d<=9;d++){
    					sum = a+b+c+d;
    					if(sum == k)count++;
    					if(d >= k)break;
    				}
    				if(c >= k)break;
    			}
    			if(b >= k)break;
    		}
    		if(a >= k)break;
    	}
    	return count;
    }
    
    
    
}