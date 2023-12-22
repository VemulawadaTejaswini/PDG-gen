import java.util.Scanner;
import java.util.TreeSet;
import java.util.Arrays;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x;
        x=sc.nextLine();
        x=x.toLowerCase();
        int count=0;
        while(true){
            String y;
            y=sc.next();
            if(y.equals("END_OF_TEXT"))break;
           y= y.toLowerCase();
            if(y.equals(x))count++;
        }
        System.out.println(count);
}
}


