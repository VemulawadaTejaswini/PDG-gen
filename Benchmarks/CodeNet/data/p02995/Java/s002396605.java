import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        long a = stdIn.nextLong();
        long b = stdIn.nextLong();
        long c = stdIn.nextLong();
        long d = stdIn.nextLong();

        long result = (b-a+1);

        if(b%c!=0 && a%c!=0){
            result -= (b-a)/c;
        }else{
            result -= (b-a)/c+1;
        }

        if(b%c!=0 && a%d!=0){
            result -= (b-a)/d;            
        }else{
            result -= (b-a)/d+1; 
        }

        if(b%(c*d)!=0 && a%(c*d)!=0){
            result += (b-a)/(c*d);            
        }else{
            result += (b-a)/(c*d)+1; 
        }

        System.out.println(result);
    }
}