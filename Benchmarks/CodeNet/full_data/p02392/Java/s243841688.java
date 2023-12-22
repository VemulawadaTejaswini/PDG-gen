import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        
        if(val1 < val2 && val2 < val3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
