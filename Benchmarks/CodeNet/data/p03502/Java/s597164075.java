import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int tmp = a;
        for(int i = 0;i<String.valueOf(a).length();i++){
            b += tmp % 10;
            tmp = tmp/10;
        }
        if(a % b == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}