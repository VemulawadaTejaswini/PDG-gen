import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean iii = false;
        while(iii == false){
            if(n % 111 == 0){
                iii = true;
                n--;
            }
            n++;
        }
        System.out.println(n);
    }
}