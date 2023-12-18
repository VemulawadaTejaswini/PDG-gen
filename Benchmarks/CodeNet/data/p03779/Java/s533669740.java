import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int X = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=X; i++){
            sum += i - 1;
            if(sum>=X-i){
                System.out.println(i);
                break;
            }
        }
    }
}