import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
        
        int otsuri;
        if(N%1000==0)otsuri=0;
        else{
            int Amari = N%1000;
            otsuri = 1000-Amari;
        }
        System.out.println(otsuri);
    }
}