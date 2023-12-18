import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner yomi = new Scanner(System.in);
        byte toshi = yomi.nextByte();
        byte A,B;
        if (toshi == 1) System.out.println("Hello World");
        else {
            A = yomi.nextByte();
            B = yomi.nextByte();
            System.out.println(A + B);
        }
        
    }
}
