import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for(int i=1; i<=180; i++){
            if(((x*i)>=360) &&((x*i)%180 == 0) ){
                System.out.println(i);
                break;
            }
        }
        
        
    }
}
