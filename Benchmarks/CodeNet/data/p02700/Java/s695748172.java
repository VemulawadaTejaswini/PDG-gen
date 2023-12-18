import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int HPtaka = sc.nextInt();
        int APtaka = sc.nextInt();
        int HPao = sc.nextInt();
        int APao = sc.nextInt();
        int flag = 0;
        while(true){
            HPao -= APtaka;
            if(0 >= HPao){
                flag += 1;
                break;
            }
            HPtaka -= APao;
            if(0 >= HPtaka){
                break;
            }
        }
        if(flag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
