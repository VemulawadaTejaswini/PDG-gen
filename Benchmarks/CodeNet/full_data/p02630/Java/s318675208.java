import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] sa = br.readLine().split(" ");
        
        int[] array = new int[n];       
        for(int i=0; i<n;i++) {
            array[i] = Integer.parseInt(sa[i]);
        }        
        int q = Integer.parseInt(br.readLine());
        int[][] queryArray = new int[q][2];
        
        for(int i=0; i<q;i++) {
            String[] sa2 = br.readLine().split(" ");
            queryArray[i][0] = Integer.parseInt(sa2[0]);
            queryArray[i][1] = Integer.parseInt(sa2[1]);
        }
        
        int[] countArray = new int[100000];
        int ans = 0;        
        for(int i=0; i<n;i++) {
            countArray[array[i]-1]+=1;
            ans+=array[i];
        }
        
        for(int i=0; i<q;i++) {
            ans-=countArray[queryArray[i][0]-1]*queryArray[i][0];
            ans+=countArray[queryArray[i][0]-1]*queryArray[i][1];            
            countArray[queryArray[i][1]-1]+=countArray[queryArray[i][0]-1];
            countArray[queryArray[i][0]-1]=0;           
            System.out.println(ans);
        }
               
    }
}
