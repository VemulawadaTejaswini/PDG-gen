import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        
        ArrayList<String> array = new ArrayList<String>();
        
        for(int i = 0; i < n; i++){
            
            String prize;
            prize = sc.next();
            
            if(array.indexOf(prize) == -1){
                array.add(prize);
            }
        }
        
        
        
        System.out.println(array.size());
    }
}
