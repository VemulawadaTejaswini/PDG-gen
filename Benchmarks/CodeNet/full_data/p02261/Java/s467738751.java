import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = Integer.valueOf(scan.next());
        int[] ns_b = new int[n];
        String[] strs_b = new String[n];
        int[] ns_s = new int[n];
        String[] strs_s = new String[n];
        for(int i=0;i<n;i++) {
        	String str = scan.next();
        	strs_s[i] = str.substring(0, 1);
        	ns_s[i] = Integer.valueOf(str.substring(1));
        	strs_b[i] = str.substring(0, 1);
        	ns_b[i] = Integer.valueOf(str.substring(1));
        }
        bubbleSort(ns_b,strs_b,n);
        selectionSort(ns_s,strs_s,n);
        for(int i=0;i<n-1;i++) {
        	System.out.print(strs_b[i]+ns_b[i]+" ");
        }
        System.out.println(strs_b[n-1]+ns_b[n-1]);
        System.out.println("Stable");
        for(int i=0;i<n-1;i++) {
        	System.out.print(strs_s[i]+ns_s[i]+" ");
        }
        System.out.println(strs_s[n-1]+ns_s[n-1]);
        boolean check = true;
        for(int i=0;i<n-1;i++) {
        	if(!strs_s[i].equals(strs_b[i])) {
        		check=false;
        		break;
        	}
        }
        if(check) {
        	System.out.println("Stable");
        }
        else {
        	System.out.println("Not stable");
        }
        scan.close();
    }
    
    public static void bubbleSort(int[] ns,String[]strs,int n) {
    	boolean fg = true;
        int change = 0;
        String changeS;
        while(fg) {
        	fg = false;
        	for(int i=n-1;i>0;i--) {
        		if(ns[i] < ns[i-1]) {
        			change =  ns[i];
        			ns[i] = ns[i-1];
        			ns[i-1] = change;
        			changeS =  strs[i];
        			strs[i] = strs[i-1];
        			strs[i-1] = changeS;
        			fg=true;
        		}
        	}
        }
    }
    
    public static void selectionSort(int[] ns,String[]strs,int n) {
    	int change = 0;
        int minj=0;
        String changeS;
        for(int i=0;i<n;i++) {
        	minj = i; 
        	for(int j=i;j<n;j++) {
        		if(ns[j]<ns[minj]) {
        			minj = j;
        		}
        	}
        	if(minj!=i) {
	        	change = ns[minj];
	        	ns[minj] = ns[i];
	        	ns[i] = change;
	        	changeS = strs[minj];
	        	strs[minj] = strs[i];
	        	strs[i] = changeS;
        	}
        }
    }
}
