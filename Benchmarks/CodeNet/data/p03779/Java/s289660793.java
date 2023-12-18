import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i = 0;
        int y = 0;

        while(true){
            if(y >= x){
                System.out.print(i);
                return;
            }
            i++;
            y += i;
        }

    }
}
