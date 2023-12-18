import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long h = Long.parseLong(sc.next());
        long w = Long.parseLong(sc.next());
        long ans = 0;
        if((h * w)%2==0){
            ans = (h * w)/2;
        }else{
            ans = (h * w)/2 +1;
        }
        System.out.println(ans);

    }
}