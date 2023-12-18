import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        int a = 0;
        int b = 0;
        sc.close();
        boolean ebi = false;
        for(int i = -120 ; i < 120 && ebi == false; i++){
            for(int j = -120 ; j < 120 && ebi == false; j++ ){
                if(i * i * i * i * i - j * j * j * j * j == x){
                    a = i;
                    b = j;
                    ebi = true;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}