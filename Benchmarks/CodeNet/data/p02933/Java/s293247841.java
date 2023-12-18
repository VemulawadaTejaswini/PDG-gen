import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String s;
        while(a == 0 || (a < 2800 && a >= 5000)){
            a = sc.nextInt();
        }
        s = sc.nextLine();
        if(a >= 3200){
            System.out.println(s);
        } else{
            System.out.println("red");
        }
    }
}