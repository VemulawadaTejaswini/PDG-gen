import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long target = sc.nextLong();
        double mon = 100.0d;
        for(int i = 0;;i++){
            if(mon>=target){
                System.out.println(i);
                break;
            }
            mon = mon*1.01d;
            mon = Math.floor(mon);
        }
    }
}