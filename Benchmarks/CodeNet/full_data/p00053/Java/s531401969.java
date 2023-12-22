//Volume0-0053
import java.util.Scanner;
 
public class Main {
 
	//declare
	private static final int        PRM_MAX   = 104730,
	                                PRM_NUM   =  10001;
	private static       boolean [] prm_table = new boolean[PRM_MAX];
	private static       int     [] prm_sum   = new int    [PRM_NUM];

    public static void main(String[] args) {
    	
    	//initialize
    	init();
    	
    	//input
    	int n;
    	Scanner sc = new Scanner(System.in);
    	while((n = sc.nextInt()) != 0){
    		
    		//output
    		System.out.println(prm_sum[n]);
    	}
    }
    
    private static void init(){
    	
    	//A prime number table is created.
    	prm_table[2] = true;
    	for(int i=3;i<PRM_MAX;i+=2){prm_table[i] = true;}
    	for(int i=3;i<PRM_MAX;i+=2){
    		if(prm_table[i]){
    			for(int j=i*2;j<PRM_MAX;j+=i){
    				prm_table[j] = false;
    			}
    		}
    	}
    	
    	//The table of the sum of a prime number is created.
    	for(int i=2,j=1;i<PRM_MAX;i++){
    		if(prm_table[i]){
    			prm_sum[j] = i + prm_sum[j-1];
    			j++;
    		}
    	}
    }
}