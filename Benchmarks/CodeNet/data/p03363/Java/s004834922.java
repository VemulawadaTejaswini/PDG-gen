import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        long number[] = new long[N];
        int DP[] = new int[N];
        long DP2[] = new long[N];
        
        long ans = 0;
        
        for(int i=0;i<number.length;i++){
        	
        	if(i==0)
        		DP2[i] = in.nextInt();
        	else
        		DP2[i] = DP2[i-1]+in.nextInt();
        	
        	if(DP2[i]==0&&ans==0){
        		ans++;
        		DP[i]++;
        	}
        }

       
        
        for(int i=1;i<number.length-1;i++)
        	for(int j=i+1;j<number.length;j++){

        		if(DP2[j]-DP2[i-1]==0){
        				ans+=(DP[i-1]+1);
        				DP[j]+=DP[i-1]+1;
        				break;
        		}

        	
        }
        		
        		

        System.out.println(ans);

        in.close();
    }

}
