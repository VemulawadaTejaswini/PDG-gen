import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int anc = 0;
        int count = 0;
        int x=1,y=1,z=1;
        for(int N = 1;N <= L;N++){
            for(x = 1;x <= 99;x++){
                for(y = 1;y <= 99;y++){
                    for(z = 1;z <= 99;z++){
                        if(x*x + y*y + z*z + x*y + y*z + z*x > 10000){
                            break;
                        }else if(N == x*x + y*y + z*z + x*y + y*z + z*x){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
