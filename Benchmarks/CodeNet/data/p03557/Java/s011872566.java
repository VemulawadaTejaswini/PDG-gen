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
        	iaary[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
        	ibary[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
        	icary[i] = sc.nextInt();
        }
        for(int x=0;x<n;x++){
        	for(int y=0;y<n;y++){
        		for(int z=0;z<n;z++){
        			if(iaary[x]<ibary[y]){
        				if(ibary[y]<icary[z]){
        					iret++;
        				}
        			}    				
        		}
        	}
        }
        System.out.println(iret);
    }
}
