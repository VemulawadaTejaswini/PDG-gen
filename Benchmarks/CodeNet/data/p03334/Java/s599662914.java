import java.util.Scanner;

/**
 *
 * @author Suraj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int d1=in.nextInt();
        int d2=in.nextInt();
        int a=0,l=0;
        if(d1>d2){
            l=d1;
        }
        else{
            l=d2;
        }
        l=((int) Math.sqrt((l+1)/2))+1;
        for(int i=0;i<n*n;i++){
            System.out.println(a+" "+a);
            a=a+l;
        }
    }
    
}
