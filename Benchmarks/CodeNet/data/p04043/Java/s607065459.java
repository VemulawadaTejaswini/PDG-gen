import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        
        Map<Integer, Integer> input = new HashMap<Integer, Integer>();
        
        int in = 0;
        int x = 0;
        
        for(int i = 0 ; i < 3 ; i++){
            in = scan.nextInt();
            if(input.get(in) != null){
                x = input.get(in);
                x = x + 1;
                input.put(in, x);
                x = 0;
            }else{
                x = x + 1;
                input.put(in, x);
            }
        }
        
        int number5 = 0;
        int number7 = 0;
        String ans = "NO";
            
        number5 = input.get(5);
        if(number5 == 2){
            number7 = input.get(7);
            if(number7 == 1){
                ans = "YES";
            }
        }

        System.out.println(number5); 
        System.out.println(number7); 
        System.out.println(ans);
        
    }
}