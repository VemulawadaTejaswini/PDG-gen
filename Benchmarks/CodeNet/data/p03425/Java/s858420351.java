
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static double plzh(int a,int b){
        double fenzi=1,fenmu=1;
        for(int i=b;i>=a;i--){
            fenzi*=i;
        }
        for(int i=1;i<=a;i++){
            fenmu*=i;
        }
        return fenzi/fenmu;
    }
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int book[]=new int[5];
        for(int i=0;i<5;i++){
            book[i]=0;
        }
        for(int i=0;i<n;i++){
            String s=sc.next();
            char c=s.charAt(0);
            if(c=='M')
                book[0]++;
            else if(c=='A')
                book[1]++;
            else if(c=='R')
                book[2]++;
            else if(c=='C')
                book[3]++;
            else if(c=='H')
                book[4]++;
        }
        System.out.println(book[0]*book[1]*book[2]+book[0]*book[1]*book[3]+book[0]*book[1]*book[4]+book[0]*book[2]*book[3]+book[0]*book[2]*book[4]+
                book[0]*book[3]*book[4]+book[1]*book[2]*book[3]+book[1]*book[2]*book[4]+book[1]*book[3]*book[4]+book[2]*book[3]*book[4]);
    }
}
