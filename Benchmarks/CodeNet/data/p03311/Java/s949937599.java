
import java.io.*;
import java.util.*;

public class Uva {
    public static long sad(long arr[],int b){
        long total = 0;
        for(int i=0;i<arr.length;i++){
            total += Math.abs(arr[i]-(b+i+1));
        }
        return total;
    }
    
    public static void main(String arg[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long arr[] = new long[N];
        for(int i=0;i<N;i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        
        int low = -2*N;
        int high = 2*N;
        long min = Long.MAX_VALUE;
        long index = -1;
        
//        for(int i=-1*N;i<N;i++){
//            System.out.println(sad(arr,i));
//        }
        
        while(low<=high){
            int mid = (low+high)/2;
            long sad = sad(arr,mid);
            long left=0;
            long right=0;
            
            if(mid-1>=low){
                left = sad(arr,mid-1);
            }
            if(mid+1<=high){
                right = sad(arr,mid-1);
            }
            if(min>sad){
                min = Math.min(sad,min);
                index = mid;
            }
            if(mid-1<low&&mid+1>high){
                break;
            }else if(mid-1<low&&right>sad){
                break;
            }else if(mid+1>high&&left>sad){
                break;
            }else if(left<sad){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(min);
    }
}
