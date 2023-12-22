import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num = Integer.parseInt(sc.next());
        int[] s = new int[num];
        for(int i=0; i<num; i++){
            s[i] = Integer.parseInt(sc.next());
        }
        
        int q = Integer.parseInt(sc.next());
        int count=0, wanted=0;
        for(int i=0; i<q; i++){
            wanted = Integer.parseInt(sc.next());
            if(binarySearch(s, wanted)>=0) count++;
        }
        System.out.println(count);
    }
    public static int binarySearch(int[] dt, int target){
        int left=0, right=dt.length-1;
        int mid=-1;
        
        while(left<=right){
            mid = (right+left)/2;
            if(dt[mid] == target){
                return mid;
            }
            if(dt[mid] < target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return -1;
    }
}
