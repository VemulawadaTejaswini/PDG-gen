import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int now;
        int before=1;
        for(int i=1; i<=32; i++){
            now = i*i;
            if(now>x){
                System.out.println(before);
                break;
            }else if(now==x){
                System.out.println(now);
                break;
            }
            before=now;
        }
    }

}