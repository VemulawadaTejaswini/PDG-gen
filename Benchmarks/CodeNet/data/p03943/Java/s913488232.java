import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;

        if(a%2 == 0 && b%2 == 0 && c%2 == 0 && sum%2 == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}