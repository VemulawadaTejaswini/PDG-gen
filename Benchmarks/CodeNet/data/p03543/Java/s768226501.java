import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int x = 1; 
        
        for(int i=0; i<3; i++){
            if(N.charAt(i)==N.charAt(i+1)){
                x += 1;
            }
            if(x>=3){
                System.out.println("Yes");
                break;
            }
            else if(i<=2){
                System.out.println("No");
            }
        }
    }
}
