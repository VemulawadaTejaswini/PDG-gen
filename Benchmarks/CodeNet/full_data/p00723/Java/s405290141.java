import java.io.*;
import java.util.*;

public class Main{
	public static void solve(String str){
    	HashSet<String> ptn= new HashSet<String>();
    	ptn.add(str);
    	for(int i=1;i<str.length();i++){
    		String str_frt= str.substring(0,i);
    		String str_bck= str.substring(i);
    		StringBuilder sb_frt_inv= new StringBuilder();
    		StringBuilder sb_bck_inv= new StringBuilder();
    		for(int j=str_frt.length()-1;j>=0;j--){
    			sb_frt_inv= sb_frt_inv.append(str_frt.charAt(j));
    		}
    		for(int j=str_bck.length()-1;j>=0;j--){
    			sb_bck_inv= sb_bck_inv.append(str_bck.charAt(j));
    		}
    		String str_frt_inv= sb_frt_inv.toString();
    		String str_bck_inv= sb_bck_inv.toString();
    		
    		ptn.add(str_frt+str_bck_inv);
    		ptn.add(str_frt_inv+str_bck);
    		ptn.add(str_frt_inv+str_bck_inv);
    		ptn.add(str_bck+str_frt);
    		ptn.add(str_bck+str_frt_inv);
    		ptn.add(str_bck_inv+str_frt);
    		ptn.add(str_bck_inv+str_frt_inv);
    	}
    	
    	System.out.println(ptn.size());
	}
    public static void main(String args[]) throws Exception{
    	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    	int rep= Integer.valueOf(br.readLine());
    	for(int i=0;i<rep;i++){
        	solve(br.readLine());
    	}
    }
}