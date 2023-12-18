
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x;
        long y;
        if((a-1)%2==0){
        	if(((a-1)/2)%2==0){
        		x = a-1;
        	}
        	else{
        		x = (a-1)^(long)1;
        	}
        }
        else{
        	if(a%2==0){
        		x = (long)1;
        	}
        	else{
        		x = 0;
        	}
        }

        if(b%2==0){
        	if((b/2)%2==0){
        		y = b;
        	}
        	else{
        		y = b^(long)1;
        	}
        }
        else{
        	if((b+1)%2==0){
        		y = (long)1;
        	}
        	else{
        		y = 0;
        	}
        }
        if(a==b){
        	System.out.println(a);
        }
        else{
	        System.out.println(x^y);
	    }
    }
}