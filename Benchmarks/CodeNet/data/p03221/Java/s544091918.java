import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N=0,M=0;
        int[] Pi,Yi;
        String[] ID;
        StringBuilder plpd;
        StringBuilder xlpd;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        Pi = new int[M+1];
        Yi = new int[M+1];
        ID = new String[M+1];
        for(int index=1;index<=M;index++){
        	Pi[index]=sc.nextInt();
        	Yi[index]=sc.nextInt();
        }
        
        for(int i=1;i<=M;i++){
        	ArrayList<Integer> arr=new ArrayList<Integer>();
        	for(int j=1;j<=M;j++){
        		if(Pi[i]==Pi[j]){
        			arr.add(Yi[j]);
        		}
        	}
        	Collections.sort(arr);
        	plpd=new StringBuilder("");
        	xlpd=new StringBuilder("");
        	for(int k=0;k<6-Integer.toString(Pi[i]).length();k++){
        		plpd.append("0");
        	}
        	for(int k=0;k<6-Integer.toString(arr.indexOf(Yi[i])+1).length();k++){
        		xlpd.append("0");
        	}
        	ID[i]=plpd.toString()+Pi[i]+xlpd.toString()+(arr.indexOf(Yi[i])+1);
        }
       for(int i=1;i<=M;i++){
    	   System.out.println(ID[i].toString());
       }
	}
	
}
