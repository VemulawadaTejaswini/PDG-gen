import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if((c%b>0?c/b+1:c/b)<=(a%d>0?a/d+1:a/d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}