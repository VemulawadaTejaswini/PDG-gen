import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        int n = stdIn.nextInt();
        
        boolean flag[] = new boolean[101];
        
        for(int i = 0; i < 101; i++){
            flag[i] = true;
        }
        
        for(int i = 0; i < n; i++){
            flag[stdIn.nextInt()] = false;
        }
        
        
        if(n != 0){
            for(int i = 1; ; i++){
                if(flag[x - i] == true){
                    System.out.println(x - i);
                    break;
                }
                
                if(flag[x + i] == true){
                    System.out.println(x + i);
                    break;
                }
            }
        }else{
            System.out.println(x);
        }
        
    }
}
