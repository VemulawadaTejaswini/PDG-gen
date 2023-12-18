import java.util.Scanner;
public class Main{
    public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       String[] X = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
       int i;
       String Y = scan.nextLine();
       for(i=0;i<7;i++) if(Y.equals(X[i]))break;
       System.out.printf("%d",7-i);
    }
}