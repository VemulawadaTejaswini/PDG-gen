import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int b = 1,nb = -1;
        while(true){
            double NB = Math.pow(nb,5);
            double B = Math.pow(b,5);
            double A = Math.pow((x+B),0.2);
            double NA = Math.pow((x+NB),0.2);
            int A_int = (int)Math.pow((x+B),0.2);
            int NA_int = (int)Math.pow((x+NB),0.2);
            if(A_int == A){
                System.out.println(A+" "+B);
                 break;
            }
            else if(NA_int == NA){
                System.out.println((int)NA+" "+(int)NB);
                break;
            }
            b++;
            nb--;
        }
    }
}