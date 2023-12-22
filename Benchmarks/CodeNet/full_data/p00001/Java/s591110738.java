import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner angi=new Scanner(System.in);
     int a[]=new int[10];
    for(int cont=0;cont<10;cont++){
        a[cont]=angi.nextInt();
    }
    Arrays.sort(a);
    System.out.println(a[9]);
    System.out.println(a[8]);
    System.out.println(a[7]);
    }
    
}