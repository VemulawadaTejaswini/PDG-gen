import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String s = "red";
        a = Integer.parseInt(sc.nextLine());
        if(a >= 3200){
            s = sc.nextLine();
        }
        System.out.println(s);
        sc.close();
    }
}