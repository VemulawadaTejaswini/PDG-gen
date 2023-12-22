import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int val1 = sc.nextInt();
        
        int hour = val1/3600;
        Math.floor(hour);
        
        int minutes =val1/60 ;
        Math.floor(minutes);
        minutes = minutes - hour*60;
        
        int second = val1 ;
        second = second - (hour*3600 + minutes*60);
        
        System.out.println((hour) + ":" + (minutes) +":"+ (second));
         
    }
    
}
