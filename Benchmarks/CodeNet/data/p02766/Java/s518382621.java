import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        long n,k,con,tmp;
        n=scan.nextLong();
        k=scan.nextLong();
        con=0;
        tmp=1;
        while(tmp<=n){
            tmp*=k;
            con+=1;
        }
        System.out.println(con);
    }
}