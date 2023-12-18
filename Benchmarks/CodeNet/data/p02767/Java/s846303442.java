import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ninzu = sc.nextInt();
        int []loc_human = new int[ninzu];
        
        for (int i = 0; i < ninzu; i++){
            loc_human[i] = sc.nextInt();
        }
        
        Arrays.sort(loc_human);
        
        int result = 0;
        
        for (int i = loc_human[0]; i < loc_human[ninzu-1]; i++){
            int total = 0;
            for (int l = 0; l < loc_human.length; l++){
                total += (int)Math.pow(i - loc_human[l], 2);
            }
            
            if (result == 0 || total < result){
                result = total;
            } 
        } 

        System.out.println(result);
    }
}
