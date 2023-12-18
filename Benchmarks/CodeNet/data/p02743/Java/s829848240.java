import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        boolean ok = Math.sqrt(c)==(Math.sqrt(a) + Math.sqrt(b));

        if(ok){
            System.out.println("No");
        }else{
            System.out.println(a+b <= c/2 ?"Yes":"No");
        }

        

    }
}
