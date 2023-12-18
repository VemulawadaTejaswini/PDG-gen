import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan. close();
        
        int flag = 0;
        for(int i = a; i <= b; i++){
            if(i % k == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }
    }
}