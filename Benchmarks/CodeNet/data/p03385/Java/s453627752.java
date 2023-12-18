import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a=="abc" || a=="acb"||a=="bac" || a=="bca" ||a=="cab" ||a=="cba") {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}