
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int oddcount = 0;
        int evencount = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
        	if(i%2==0){
        		if(s.charAt(i)=='0'){
        			oddcount++;
        		}
        		else{
        			evencount++;
        		}
        	}
        	else{
        		if(s.charAt(i)=='0'){
        			evencount++;
        		}
        		else{
        			oddcount++;
        		}
        	}
        }

        System.out.println(Math.min(oddcount, evencount));
    }
}