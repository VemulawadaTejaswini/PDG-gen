import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        if(k%2==0){
            k/=2;
            System.out.println(k*k);
        }
        else{
            k/=2;
            System.out.println(k*(k+1));
        }
    }
}