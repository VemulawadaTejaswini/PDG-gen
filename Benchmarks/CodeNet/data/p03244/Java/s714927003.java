
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        HashMap<Integer, Integer> oddlist = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> evenlist = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
        	v[i] = sc.nextInt();
        	if(i%2==0){
	        	if(oddlist.containsKey(v[i])){
    	    		int x = oddlist.get(v[i]);
        			oddlist.put(v[i], x+1);
        		}
        		else{
        			oddlist.put(v[i], 1);
        		}
        	}
        	else{
        		if(evenlist.containsKey(v[i])){
    	    		int x = evenlist.get(v[i]);
        			evenlist.put(v[i], x+1);
        		}
        		else{
        			evenlist.put(v[i], 1);
        		}	
        	}
        }
        if(evenlist.size()==1 && oddlist.size()==1 && v[0]==v[1]){
        	System.out.println(n/2);
        }
        else{
        	int[] oddn = new int[2];
        	int[] oddm = new int[2];
        	int[] evenn = new int[2];
        	int[] evenm = new int[2];
        	for(int x : oddlist.keySet()){
        		if(oddm[0]<oddlist.get(x)){
        			oddn[1] = oddn[0];
        			oddm[1] = oddm[0];
        			oddn[0] = x;
        			oddm[0] = oddlist.get(x);
        		}
        		else if(oddm[1]<oddlist.get(x)){
        			oddn[1] = x;
        			oddm[1] = oddlist.get(x);
        		}
        	}
        	for(int x : evenlist.keySet()){
        		if(evenm[0]<evenlist.get(x)){
        			evenn[1] = evenn[0];
        			evenm[1] = evenm[0];
        			evenn[0] = x;
        			evenm[0] = evenlist.get(x);
        		}
        		else if(evenm[1]<evenlist.get(x)){
        			evenn[1] = x;
        			evenm[1] = evenlist.get(x);
        		}
        	}
        	int ans = n;
        	for(int i=0;i<2;i++){
        		for(int j=0;j<2;j++){
        			if(oddn[i]!=evenn[j]){
        				ans = Math.min(ans, ((n+1)/2-oddm[i]) + (n/2-evenm[j]));
        			}
        		}
        	}
        	System.out.println(ans);
        }
    }
}