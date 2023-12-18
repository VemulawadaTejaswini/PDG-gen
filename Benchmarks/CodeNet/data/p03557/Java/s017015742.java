import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] iaary = new int[n];
		int[] ibary = new int[n];
		int[] icary = new int[n];
		int[] kakeary = new int[n];
		int iret = 0;
        for(int i=0;i<n;i++){
        	iret = sc.nextInt();
        	for(int j=0;j<i;j++){
        		if(iaary[j]>iret){
        			int sagyou = iaary[j];
        			iaary[j] = iret;
        			iret = sagyou;
        		}
        	}
    		iaary[i] = iret;
        }
        for(int i=0;i<n;i++){
        	iret = sc.nextInt();
        	for(int j=0;j<i;j++){
        		if(ibary[j]>iret){
        			int sagyou = ibary[j];
        			ibary[j] = iret;
        			iret = sagyou;
        		}
        	}
    		ibary[i] = iret;
        }
        for(int i=0;i<n;i++){
        	iret = sc.nextInt();
        	for(int j=0;j<i;j++){
        		if(icary[j]>iret){
        			int sagyou = icary[j];
        			icary[j] = iret;
        			iret = sagyou;
        		}
        	}
    		icary[i] = iret;
        }
        iret = 0;
    	for(int y=0;y<n;y++){
    		for(int x=0;x<n;x++){
    			if(iaary[x] >= ibary[y]){
    				kakeary[y] = x;
    				x = n;
    			}
    			if(x==n-1){
    				kakeary[y] = x + 1;
    				x = n;
    			}
    		}
       		for(int z=0;z<n;z++){
    			if(ibary[y] < icary[z]){
    				kakeary[y] *= (n-z);
    				z = n;
        		}
    			if(z==n-1){
    				kakeary[y] = 0;
    			}
    		}
       		iret += kakeary[y];
    	}
	    System.out.println(iret);
    }
}
