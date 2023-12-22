import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        boolean fff = false;
        while(fff == false){
            if(a < b){
                fff = true;
            }else{
                k--;
                b *= 2;
            }
        }
        fff = false;
        while(fff == false){
            if(b < c){
                fff = true;
            }else{
                k--;
                c *= 2;
            }
        }
        if(k < 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}