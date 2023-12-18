import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,k,con,tmp;
        n=scan.nextInt();
        k=scan.nextInt();
        con=0;
        tmp=1;
        while(tmp<n){
            tmp*=k;
            con+=1;
        }
        System.out.println(con);
    }
}