import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] iaary = new int[n];
		int[] ibary = new int[n];
		int[] icary = new int[n];
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
        for(int x=0;x<n;x++){
        	for(int y=0;y<n;y++){
        		if(iaary[x] < ibary[y]){
            		for(int z=0;z<n;z++){
            			if(ibary[y] < icary[z]){
            				iret += n-z;
            				z=n;
            			}
            		}
        		}
        	}
        }
        System.out.println(iret);
    }
}
