import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String r = sc.nextLine();
        String g = sc.nextLine();
        String b = sc.nextLine();

        String s = r + g + b;

        int n = Integer.parseInt(s);

        if(n%4 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}