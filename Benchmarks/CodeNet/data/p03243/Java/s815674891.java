import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        for(int i=1; i<=999; i++){
            if(N<=111*i){
                System.out.println(111 * i);
                break;
            }
        }
    }
}