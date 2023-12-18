import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        boolean flag = true;
        
        String s = stdIn.next();
        char c[] = s.toCharArray();
        
        for(int i = 0; i < 3; i++){
            if(c[i] == c[i + 1]){
                flag = false;
                break;
            }
        }
        
        if(flag){
            System.out.println("Good");
        }else{
            System.out.println("Bad");
        }
    }
}
