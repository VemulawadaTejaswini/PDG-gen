import java.util.*;
class at_1771{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        if(d/t <= s)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}