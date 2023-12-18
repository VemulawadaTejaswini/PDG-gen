import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int l = sc.nextInt();
        int r = sc.nextInt();

        int min = 10000;

        if(r - l < 2019){
            if(l%2019 > r%2019) {
                System.out.println(0);
            } else{
                System.out.println((l % 2019) * ((l+1) % 2019) % 2019);
            }
        } else {
            System.out.println(0);
        }
    }
}