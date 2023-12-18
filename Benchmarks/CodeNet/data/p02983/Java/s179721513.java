import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int aans=a%2019;
        int bans=(a+1)%2019;
        for(int i=0;i<b-a;i++){
            if((i+a+1)%2019<bans){bans=(i+a+1)%2019;}
            else if((i+a+1)%2019<aans){aans=(i+a+1)%2019;}
        }
        System.out.println(aans*bans);
    }
}