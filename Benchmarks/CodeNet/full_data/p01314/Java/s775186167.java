import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int i,j,N;
    	int reg=0;
    	int[] ary = new int[1001];
    	for(i=0;i<1001;i++){
    		ary[i]=0;
    	}
    	
    	for(i=1;i<=1000;i++){
    		for(j=2,reg=i;j<=50;j++){
    			reg=reg+i+j-1;
    			if(reg<=1000){
    			    ary[reg]++;	
    			}else{
    				break;
    			}
    		}
    			
    	}
    	while((N = sc.nextInt())!=0){
    		System.out.println(ary[N]);
    	}
    }
}
