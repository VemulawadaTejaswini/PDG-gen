import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int T = sc.nextInt();
        int S = sc.nextInt();
        
        int time =T*S;
        if(D<=time){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
