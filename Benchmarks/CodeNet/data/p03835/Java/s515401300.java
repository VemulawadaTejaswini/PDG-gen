import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int s = sc.nextInt();
        int count = 0;

        for(int x=0; x<k+1; x++){
            for(int y=0; y<k+1; y++){
                for(int z=0; z<k+1; z++){
                    if(x + y + z == s){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);


    }
}
