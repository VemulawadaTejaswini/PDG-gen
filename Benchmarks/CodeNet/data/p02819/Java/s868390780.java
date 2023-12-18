import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int flg = 1;
        double limit = Math.sqrt(x);
        
        while(true){
            for(int i=2; i<=limit; i+=2){
                if(x%i==0){
                    flg = 0;
                    break;
                }
            }
            if(flg==0){
                x++;
            }
            else{
                System.out.println(x);
                break;
            }
        }
    }
}