import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int size = n.length();
        int min = 99999;
        int sabun = 0;

        for(int i = 0;i<size-2;i++){
            int a = Integer.parseInt(n.substring(i,i+3));
            sabun = Math.abs(a-753);
            if(min>sabun){
                min = sabun;
            }

        }
        System.out.println(min);

    }
}
