import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1;i<Math.min(10,a);i++){
            System.out.println(i);
        }
        for(int i = 1;i<Math.min(20,a);i++){
            System.out.println(i*10+9);
        }
        for(int i = 1;i<Math.min(30,a);i++){
            System.out.println(i*100+99);
        }
        for(int i = 1;i<Math.min(40,a);i++){
            System.out.println(i*1000+999);
        }
        for(int i = 1;i<Math.min(50,a);i++){
            System.out.println(i*10000+9999);
        }
        for(int i = 1;i<Math.min(60,a);i++){
            System.out.println(i*100000+99999);
        }
        for(int i = 1;i<Math.min(70,a);i++){
            System.out.println(i*1000000+999999);
        }
        for(int i = 1;i<Math.min(80,a);i++){
            System.out.println(i*10000000+999999);
        }

    }
}