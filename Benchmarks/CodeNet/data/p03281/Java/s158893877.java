import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        
        int intC1 = Integer.parseInt(c1);
        

        int a = 3;
        int b = 5;
        int c = 7;
        
        int cnt=0;
        // cのカウンタ
        for (int i=0;i<5;i++) {
        	c=c+2*i;
        	
        	for (int j=0;j<20;j++) {
        		b=b+2*j;
        		if (b==c ) {
        			b=5;
            		break;
            	}
            	
        		if (a*b*c <= intC1) {
        			cnt++;
        		} else {
        			b=5;
        			break;
        		}
        	}
        }
        
    	System.out.println(cnt);   
    
    }
}