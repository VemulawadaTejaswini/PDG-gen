import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            if(sc.nextInt() == 0){
                System.out.println(i+1);
            }
        }
    }
}
