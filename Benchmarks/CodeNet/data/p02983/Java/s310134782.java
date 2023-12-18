import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int l = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());
        
        long min = 2019;
        long rem;
        for(long i = l; i <= r-1; i++){
            for(long j = i+1; j <= r; j++){
                rem = (i*j) % 2019;
                if(rem < min){
                    min = rem;
                    if(min == 0){
                        break;
                    }
                }
            }
            if(min == 0){
                break;
            }
        }
        
        System.out.println(min);
    }
}