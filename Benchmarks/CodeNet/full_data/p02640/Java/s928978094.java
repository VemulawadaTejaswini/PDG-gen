import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        
        while(x != 0){
            if(4 <= y && x != 2){
                y -= 4;
            }else{
                y -= 2;
            }
            x--;
            
        }
        if(y == 0){
            System.out.print("Yes");
            
        }else{
            System.out.println("No");
        }  
    }
}
