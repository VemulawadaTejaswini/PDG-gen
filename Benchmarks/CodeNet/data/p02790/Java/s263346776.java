import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String Ans1 = String.valueOf(a);
        String Ans2 = String.valueOf(b);
            for(int i = 1; i < b; i ++){
                Ans1 = Ans1 + String.valueOf(a);
            }
            for(int i = 1; i < a; i ++){
                Ans2 = Ans2 + String.valueOf(b);
            }
            
        int ques = Ans1.compareTo(Ans2);
        if(ques == -1) {
            System.out.println(Ans1);
        } else  {
            System.out.println(Ans2);    
        }    
        
    }
}
