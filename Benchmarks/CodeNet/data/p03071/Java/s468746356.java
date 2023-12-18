import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        if(a>b){
            count = a;
            a--;
        }else{
            count = b;
            b--;
        }

        if(a>b){
            count += a;
        }else{
            count += b;
        }

        System.out.println(count);
    }
}