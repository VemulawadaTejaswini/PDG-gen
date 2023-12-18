import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        int n,m,i,j,k,p,q,o,l,s,tt=1,t,z,aa,r=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        if(n>9 || m>9)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(n*m);
        }
 
    }
}