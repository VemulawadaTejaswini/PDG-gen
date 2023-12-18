import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int a = 0;
        String s = "red";
        while(a == 0 || a < 2800 || a >= 5000){
            a = sc1.nextInt();
        }
        if(a >= 3200){
            s = sc2.nextLine();
        }
        System.out.println(s);
    }
}