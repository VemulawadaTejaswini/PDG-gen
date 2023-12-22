import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] aa = a.split("");
        int b = 0;
        for(String c : aa){
            b += Integer.parseInt(c);
        }
        if(b % 9 == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
