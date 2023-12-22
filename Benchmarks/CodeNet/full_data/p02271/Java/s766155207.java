import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        String line2 = br.readLine();
        String[] str = line2.split(" ");
        int[] n_array = new int[n];
        for(int i=0;i<n;i++)n_array[i]=Integer.parseInt(str[i]);
        int q = Integer.parseInt(br.readLine());
        String line3 = br.readLine();
        String[] str2 = line3.split(" ");
        int[] q_array=new int[q];
        for(int i=0;i<q;i++)q_array[i]=Integer.parseInt(str2[i]);
        int cnt=0;
        boolean bFlag=false;
        for(int i=0;i<q;i++){
        	int idx=1;
        		for(int j=0;j<n;j++){
        			int s=0;
        			for(int k=j;k<n;k++){
        				s+=n_array[k];
        				if(s>q_array[i])continue;
        				if(s==q_array[i]){
        					bFlag=true;
        					break;
        				}
        			}
        		}
        	if(bFlag)System.out.println("yes");
        	else System.out.println("no");
        }
	}
}