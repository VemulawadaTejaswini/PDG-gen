import java.util.Scanner;

public class Main {
    
    public static void main (String[] args){
        
      Scanner sc = new Scanner (System.in);
        
        long L = sc.nextLong();
        long R = sc.nextLong();
        
        if (R>=2019&&L<=2019){
            System.out.println(0);
        } else {
            long min = Long.MAX_VALUE;
            boolean flag = true;
            
            for (long index=L; index<R; index++){
                if (flag==false){
                    break;
                }
                for (long index2=index+1; index2<=R; index2++){
                    if ((index*index2)%2019==0){
                        flag = false;
                        min=0;
                        break;
                    }
                    if (min>(index*index2)%2019){
                        min=(index*index2)%2019;
                    }
                }
            }
            System.out.println(min);
        }
    }
}