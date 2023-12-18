import java.math.*;
import java.util.*;
import java.lang.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a==b&&a!=c)||(a==c&&a!=b)||(b==c&&a!=b)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
