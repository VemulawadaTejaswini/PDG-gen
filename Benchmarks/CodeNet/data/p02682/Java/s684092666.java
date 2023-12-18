import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int saidai = 0;
        for(int i = 0; i < a; i++){
            saidai = saidai + 1;
            k = k - 1;
            if(k == 0){
                System.out.println(saidai);
                System.exit(0);
            }
        }
        for(int i = 0; i<b; i++){
            k = k - 1;
            if(k == 0){
                System.out.println(saidai);
                System.exit(0);
            }
        }
        for(int i = 0; i < c; i++){
            saidai = saidai - 1;
            k = k - 1;
            if(k==0){
                System.out.println(saidai);
                System.exit(0);
            }
        }
    }        
}