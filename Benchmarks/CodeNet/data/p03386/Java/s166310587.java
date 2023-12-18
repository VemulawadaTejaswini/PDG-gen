import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        if(b - a > k * 2){
            System.out.println(a);
            for(int i=1; i<=k; i++){
                System.out.println(++a);
            }
            b -= k;
            for(int i=0; i<=k; i++){
                System.out.println(b++);
            }
        }
        else{
            for(int i=0; i<=b-a; i++){
                System.out.println(a+i);
            }
        }
    }
}