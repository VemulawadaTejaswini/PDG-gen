import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        Set<Integer> set = new HashSet<>();
    
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                set.add(i * j);
            }
        }
        
        if(set.contains(N)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
