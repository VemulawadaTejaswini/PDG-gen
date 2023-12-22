import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        x=180-x;
        
        for(int i=1; i<=360; i++){
            if(((x*i)%360 == 0) ){
                System.out.println(i);
                break;
            }
        }
        
        
    }
}
