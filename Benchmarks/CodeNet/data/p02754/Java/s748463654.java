import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Long L = scan.nextLong();
        Long M = scan.nextLong();
        Long N = scan.nextLong();
        int i=1;
        while(true){
            if(L<=(M+N)){
                if(L<=M){
                    System.out.println(M*(i-1)+L);
                }else{
                    System.out.println(M*i);
                }
                break;
            }else{
                L-=(M+N);
                i++;
            }
        }
    }
}
