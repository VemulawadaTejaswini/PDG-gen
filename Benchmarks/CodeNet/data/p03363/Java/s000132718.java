import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int number[] = new int[N];
        int DP[] = new int[N];
        int DP2[] = new int[N];
        
        for(int i=0;i<number.length;i++){
        	number[i] = in.nextInt();
        	if(i==0)
        		DP2[i] = number[i];
        	else
        		DP2[i] = number[i] +  DP2[i-1];
        }

        long ans = 0;
        
        for(int i=0;i<number.length;i++){
        	for(int j=i+1;j<number.length;j++){

        		if((i==0&&DP2[j]==0)||DP2[j]-DP2[i-1]==0){
        			if(i!=0){
        				ans+=(DP[i-1]+1);
        				DP[j]+=DP[i-1]+1;
        			}else{
        				ans++;
        				DP[j]++;
        			}
        			
        			break;
        		}
        		
        	}
        }
        		
        		

        System.out.println(ans);

        in.close();
    }

}
