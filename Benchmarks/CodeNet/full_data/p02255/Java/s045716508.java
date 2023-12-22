import java.util.*;
public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int i,j,reg,k;
    	int[] ary = new int[n];
    	for(i=0;i<n;i++){
    		ary[i]=sc.nextInt();
    	}
    	for(k=0;k<n;k++){
	        System.out.print(ary[k]);
	        if(k!=n-1){
	        	 System.out.print(" ");
	        }else{
	        	System.out.println();
	        }
    	}
    	for(i=0;i<n;i++){
    		j=i;
    		if(i!=0){
    		    while(j!=0&&ary[j]<ary[j-1]){
    			    reg=ary[j-1];
    			    ary[j-1]=ary[j];
    			    ary[j]=reg;
    			        j--;
    		   }
			    for(k=0;k<n;k++){
			        System.out.print(ary[k]);
			        if(k!=n-1){
			        	 System.out.print(" ");
			        }else{
			        	System.out.println();
			        }
			    }
    		}
    	}
    }
}
