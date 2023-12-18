import java.util.*;

public class Main{ 
        
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
                                               
        int N = sc.nextInt();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int a[] = new int[N];
        
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();    
        }
        
        Arrays.sort(a);
        
        int count = 0;
        int ans = 1;
        
        boolean flag = false;
        
        for(int i = N - 1;i >= 0;i--){
            if(flag && map.containsKey(a[i]))
               continue;
            
            if(map.containsKey(a[i]) && !flag){
                ans *= a[i];                
                count++;                
                if(count == 2){
                    break;
                }                
                flag = true;                                
            }else{
                map.put(a[i],1);
                flag = false;
            }            
            
        }                        
        
        System.out.println((count == 2) ? ans: 0);
        
    }    
}       
