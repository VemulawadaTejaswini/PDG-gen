import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A=scan.nextInt();
        int B=scan.nextInt();
        int C=scan.nextInt();
        int D=scan.nextInt();
        int AB=A-B;
        int CD=C-D;
        if(CD<=0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}