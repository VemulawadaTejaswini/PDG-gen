import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=1;
        int count=0;
        while(a<m){
            a+=n-1;
            count++;
        }
        System.out.println(count);
    }
}
