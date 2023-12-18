import java.util.*;
public class Main {
    
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        
        int n_participants = sc.nextInt();
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String participants = sc.next();
        
        int pass_counter = 0;
        int b_rank = 1;
        
        for(int i = 0;i<n_participants;i++){
            if(participants.charAt(i) == 'c')
                System.out.println("No");
            else if(participants.charAt(i) == 'a'){
                if(pass_counter < a+b){
                    pass_counter++;
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                if(pass_counter < a+b && b_rank <= b){
                    pass_counter++;
                    b_rank++;
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }
}