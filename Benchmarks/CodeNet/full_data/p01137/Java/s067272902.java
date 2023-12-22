import java.util.Scanner;
import java.lang.Math;
 
public class Main {
 
    public static void main(String[] args) {
 
        try (Scanner sc = new Scanner(System.in)){
 
            while(true){
                int input = sc.nextInt();
                if(input == 0) break;
 
                int x = 0;
                int y = 0;
                int z = 0;
 
                int z_ = input;
                int min = 999999999;
 
                for (int i=0; i<=(int) Math.sqrt(z_)+1; ++i) { // z
                    int y_ = z_ - i * i * i;
                    if (y_ < 0) break;
 
                    for (int j=0; j<=(int) Math.sqrt(y_)+1; ++j) { // y
                        int x_ = y_ - j * j;
 
                        if (x_ < 0) break;
 
                        int k = x_;
                        int r = i + j + k;
 
                        if (r < min) {
                            min = r;
                        }
 
                    }
                }
 
                System.out.println(min);
            }
        }
 
    }
 
}
