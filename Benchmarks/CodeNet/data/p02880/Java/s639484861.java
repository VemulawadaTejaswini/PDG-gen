import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        boolean flag = false;
        
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                if(i * j == n){
                    flag = true;
                }
            }
        }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
