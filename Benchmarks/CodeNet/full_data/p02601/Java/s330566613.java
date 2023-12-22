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
        int aaa = 0;
        if(a < b){
            k++;
            aaa++;
        }
        if(b < c){
            k++;
        }
        while(fff == false){
            b *= 2;
            k--;
            if(a < b){
                fff = true;
            }
        }
        if(aaa == 1){
            b /= 2;
        }
        fff = false;
        while(fff == false){
            c *= 2;
            k--;
            if(b < c){
                fff = true;
            }
        }
        if(k < 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}