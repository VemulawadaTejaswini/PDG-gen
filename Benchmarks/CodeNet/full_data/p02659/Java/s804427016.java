import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Scanner scan = new Scanner(System.in);
        long N= scan.nextLong();
        double M= scan.nextDouble();
        long MM=(long)(M*100);
        long i=N*MM;
        String MMM=String.valueOf(i);

        MMM=MMM.substring(0,MMM.length()-1);
        long p=Long.parseLong(MMM);

System.out.println(p);


    }
}
