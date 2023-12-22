import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn =  new Scanner(System.in);
        
        double max = 0;
        double min = 1000000;
        
        while(stdIn.hasNext()){
            double x = stdIn.nextDouble();
            
            if(x > max){
                max = x;
            }
            
            if(x < min){
                min = x;
            }
            
        }
        
        System.out.println(max - min);
    }
}

