import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextDouble()){
            double n = sc.nextDouble();
            if(n <= 48.0){
                System.out.println("light fly");
            }else if(n <= 51.0){
                System.out.println("fly");
            }else if(n <= 54.0){
                System.out.println("bantam");
            }else if(n <= 57.0){
                System.out.println("feather");
            }else if(n <= 60.0){
                System.out.println("light");
            }else if(n <= 64.0){
                System.out.println("light welter");
            }else if(n <= 69.0){
                System.out.println("welter");
            }else if(n <= 75.0){
                System.out.println("light middle");
            }else if(n <= 81.0){
                System.out.println("middle");
            }else if(n <= 91.0){
                System.out.println("light heavy");
            }else{
                System.out.println("heavy");
            }
        }
    }
}
