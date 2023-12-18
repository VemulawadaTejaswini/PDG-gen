import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int even,odd;
        even=odd=k/2;
        if(k%2==1){
            odd+=1;
        }
        System.out.println(even*odd);
    }
}
