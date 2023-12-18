import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean fg = false;

        sc.close();

        while(a <= b){
            a++;
            fg = (a%k==0)? true: false;
            if(fg == true){
                break;
            }
        }
        if(fg==true){
            System.out.println("OK");
        }else{      
            System.out.println("NG");
        }
    }
}