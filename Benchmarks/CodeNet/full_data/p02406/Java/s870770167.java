import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1, k, n;
        n = sc.nextInt();
        while(i <= n){
            if(i % 3 == 0){
                System.out.print(" " + i);
            }else{
                k = i;
                while(k != 0){
                    if(k % 10 == 3){
                        System.out.print(" " + i);
                        break;
                    }else{
                        k /= 10;
                    }
                }
            }
            i++;
        }
        System.out.println();
    }
}

