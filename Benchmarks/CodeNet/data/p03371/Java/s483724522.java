import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab = sc.nextInt();
        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int price = 0;
        if(a/2 > ab){
            a = ab*2;
        }
        if(b/2 > ab){
            b = ab*2;
        }
        if(a + b >= ab*2){
            if(aa<bb){
                price += aa*ab*2 + (bb-aa)*b;
            }else if(aa>bb){
                price += bb*ab*2 + (aa-bb)*a;
            }else{
                price += bb*ab*2;
            }
        }
        else{
            price += aa*a + bb*b;
        }
        System.out.println(price);
    }
}