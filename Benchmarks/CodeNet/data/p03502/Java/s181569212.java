import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = 0;

        if(N<=10){
            System.out.println("Yes");
            return;
        }

        while(N>0){      
        H += N%10;
        N /= 10; 
        }

        if(N%H==0)
        System.out.println("Yes");
        else
        System.out.println("No");
                  
    
    }    
}


