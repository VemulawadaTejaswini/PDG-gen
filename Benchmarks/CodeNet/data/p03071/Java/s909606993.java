import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(task(a,b));
    }

    public static int task(int a,int b){
        int x = Math.max(a+(a-1),b+(b-1));
        int y = Math.max(a + b,x);
        return y;
    }
}