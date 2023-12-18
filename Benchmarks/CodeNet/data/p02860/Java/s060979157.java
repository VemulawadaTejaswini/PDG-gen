import java.util.*;
public class Main{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        if(n%2==0){
            String a =s.substring(0, n/2);
            String b =s.substring(n/2,n);
            if(Objects.equals(a, b)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }
    }
}