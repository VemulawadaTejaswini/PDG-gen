import java.util.Scanner;

/**
 * Description ：
 *
 * @author poyun
 * @version V1.0.0
 * @since 1.0
 * date 2020/5/10
 */
public class Main {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Integer a = input.nextInt();
        Integer b = input.nextInt();
        Integer c = input.nextInt();
        Integer d = input.nextInt();
        System.out.println(compare(a,b,c,d));
    }


    public static int compare(int a, int b, int c,int k){
        if(a>=k) return a;
        if(a+b>=k) return a;
        if(a+b+c>=k)return a-(k-a-b);
        return 0;
    }
}
