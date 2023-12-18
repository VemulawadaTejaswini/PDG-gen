import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        
        Set <Integer> nums = new HashSet<Integer>();
        
        for (int i = 0; i < N; i++){
        
            nums.add(sc.nextInt());
        
        }
        
        sc.close();

        for (int num:nums){
            
            System.out.print(num + " ");
        
        }
        
    }
}