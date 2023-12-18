import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        String[] splitN = N.split("", 0);
        int sum = 0;
        
        for(int i = 0; i < splitN.length; i++){
            sum += Integer.parseInt(splitN[i]);
        }
        
        if(Integer.parseInt(N) % sum == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
