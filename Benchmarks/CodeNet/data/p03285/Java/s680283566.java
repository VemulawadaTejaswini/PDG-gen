
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=0;i<20;i++){
            if(N-(i*4)<0){
                break;
            }
            if((N-(i*4))%7==0){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}
