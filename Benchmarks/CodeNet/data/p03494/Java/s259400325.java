import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[] a = new int[n];
        for(int i=0; i<n; i++){ a[i] = sc.nextInt(); }
        
        while(true){
            
            if(isOdd(a)){
                break;
            }
            
            
            for(int i=0;i<a.length;i++){
                a[i] /= 2;
            }
            count++;
            
        }
        System.out.println(count);
    }
    
    public static boolean isOdd(int[] a){
        boolean isOddFlag = false;
        for(int i=0;i<a.length; i++){
            if(a[i] % 2 != 0){
                isOddFlag = true;
            }
        }
        return isOddFlag;
    }
}
