import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rectangle {
    Integer a;
    Integer b;
    
    public Rectangle(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    
    public Integer calculateArea() {
        return  a*b;
    }
    public Integer calculatePerimeter() {
        return  2*(a+b);
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = reader.readLine();
        String[] splitStrings = inputLine.split("\\s");
        
        if(splitStrings.length != 2) {
            throw new Exception("invalid input");
        }
        
        Rectangle rectangle = new Rectangle(Integer.parseInt(splitStrings[0]), Integer.parseInt(splitStrings[1]));
        System.out.printf("%d %d\n", rectangle.calculateArea(), rectangle.calculatePerimeter());
    }
}

