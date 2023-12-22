import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long seven = 7l;
        long kake = 10;
        int counter = 1;
        while(true){
            if(seven < K){
                seven += seven*kake;
                kake *= 10;
                counter++;
            }else{
                break;
            }
        }
        if(K % 2 != 0){
            while(true){
                if(seven % K == 0){
                    counter++;
                    System.out.println(counter);
                    break;
                }else{
                    seven += seven*kake;
                    kake *= 10;
                    counter++;
                }
            }
        }else{
            System.out.println(-1);
        }
    }
}
