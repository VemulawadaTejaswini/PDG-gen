import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int caseA = Math.abs(Y-X);
        int caseB = Math.abs(Y-(-X))+1;
        int caseC = Math.abs((-Y)-(-X))+2;
        int caseD = Math.abs((-Y)-X)+1;
        System.out.println(Math.min(Math.min(caseA, caseB), Math.min(caseC, caseD)));
    }
    
}