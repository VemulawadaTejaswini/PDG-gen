import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int pay = 700;
        if(a.charAt(0) == 'o'){
            pay += 100;
        }
        if(a.charAt(1) == 'o'){
            pay += 100;
        }
        if(a.charAt(2) == 'o'){
            pay += 100;
        }
        System.out.println(pay);
    }
}