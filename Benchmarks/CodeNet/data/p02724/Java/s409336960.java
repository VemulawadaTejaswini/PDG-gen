import java.util.*;
public class GoldenCoins {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        long X = input.nextLong();//1024 = 1000+5+5+5+5+4
        long happ = 0;
        long Y=0, r=0;
          
        
        if(X==0){
            happ = 0;
            System.out.println(happ);
        }else if(X>=500 && X<=1000){
            Y=X-500;//24
            r=X-Y;//1000
            Y=Y%5;//4
            happ=(Y*5)+(2*r);
            System.out.println(happ);
        }
        else if(X>1000 && X<=10000){
            Y=X-1000;//24
            r=X-Y;//1000
            Y=Y%5;//4
            happ=(Y*5)+(2*r);
            System.out.println(happ);
        }
        else{
            happ=2*X;
            System.out.println(happ);
        }
            
        
    }
}