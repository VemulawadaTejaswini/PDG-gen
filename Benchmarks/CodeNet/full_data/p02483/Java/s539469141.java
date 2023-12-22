import java.util.Scanner;

public class Sorting{
    public static void main(Sorting[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a < b){
            if(b < c){
                System.out.printf("%d %d %d\n",a,b,c);
            }else if(a < c && c < b){
                System.out.printf("%d %d %d\n",a,c,b);
            }
        }else if(b < c){
            if(c < a){
                System.out.printf("%d %d %d\n",b,c,a);
            }else if(a < c && b < a){
                System.out.printf("%d %d %d\n",b,a,c);
            }
        }else if(c < a){
            if(a < b){
                System.out.printf("%d %d %d\n",c,a,b);
            }else if(c < b && b < a){
                System.out.printf("%d %d %d\n",c,b,a);
            }
        }
    }
}