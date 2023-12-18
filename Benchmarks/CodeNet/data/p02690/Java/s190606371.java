import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(long a = -200; a < 200; a++){
            for(long b = -200; b < 200; b++){
                if(Math.pow(a, 5) - Math.pow(b, 5) == x){
                    System.out.print(a +" "+ b);
                    return;
                }
            }
        }

    }
}
