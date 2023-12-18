import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1;i<=Math.min(10,a);i++){
            System.out.println(i);
        }
        for(long i = 0;i<a-9;i++){
            System.out.println(19+i*10);
        }
    }
}