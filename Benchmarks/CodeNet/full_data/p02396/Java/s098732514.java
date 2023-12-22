import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int [] Array = new int [10000];
        for(int i=0;true;i++){
            int x = sc.nextInt();
            if(x!=0){    
                Array[i]=x;
                System.out.println("Case "+i+":"+Array[i]);
            }else{
               break;
            }
                
        }


    }
}
