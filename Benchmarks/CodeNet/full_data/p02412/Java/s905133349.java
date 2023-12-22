import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int n=Integer.parseInt(a[0]);
        int x=Integer.parseInt(a[1]);
        while(!(n==0&&x==0)){
            List<String> l = new ArrayList<String>(); 
            int c=0;
        	for(int i=1;i<=n;i++){
            	for(int j=1;j<=n;j++){
                	for(int k=1;k<=n;k++){
                		if(i!=j&&j!=k&&k!=i&&i+j+k==x){
                			String num=null;
                			if(i<j&&j<k){
                				num=i+" "+j+" "+k;
                			}else if(i<k&&k<j){
                				num=i+" "+k+" "+j;
                			}else if(j<i&&i<k){
                				num=j+" "+i+" "+k;
                			}else if(j<k&&k<i){
                				num=j+" "+k+" "+i;
                			}else if(k<j&&j<i){
                				num=k+" "+j+" "+i;
                			}else{
                				num=k+" "+i+" "+j;
                			}
                			if(l.indexOf(num)==-1){
                				l.add(num);
                    			c++;
                			}
                		}
                	}
            	}
        	}
        	System.out.println(c);
        	a=br.readLine().split(" ");
            n=Integer.parseInt(a[0]);
            x=Integer.parseInt(a[1]);
        }
	}
}