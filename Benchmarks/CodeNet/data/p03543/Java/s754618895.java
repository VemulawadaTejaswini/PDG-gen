import java.util.*;

public class  Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = n % 1000;
        int n2 = n / 10;
        if(n1%111==0 || n2%111 ==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}