import java.util.*;

public class Main{

    public static void main(String[] ards){
        Scanner sc = new Scanner(System.in);
        while(true){
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x==0 && y==0){break;}

            if(x>y){
                int[] a = new int[1];
                int[] b = new int[1];
                int temp;
                a[0]=x;b[0]=y;
        
                temp = a[0];
                a[0] = b[0];
                b[0] = temp;

                x=a[0];y=b[0];

            }
            System.out.println(x + " " + y);
        }
    }
}

