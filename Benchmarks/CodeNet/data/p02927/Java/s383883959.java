import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();
        int count = 0;
        int d1=0;
        int d10=0;
            
            for(int i=4; i<=M; i++){
                for(int j =22; j<=D; j++){
                    d1 = j%10;
                    d10 = j/10;
                    if(d1>=2 && d10 >=2 && d1*d10 == i){
                        count++;
                    }
                }
            }
            
            System.out.println(count);
    } 
}
