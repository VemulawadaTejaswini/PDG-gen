import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if(a%2 == 0){
            a /= 2;
            a *= a;
        }
        else{
            a /= 2;
            a *= (a+1);
        }
        System.out.println(a);
    }
}