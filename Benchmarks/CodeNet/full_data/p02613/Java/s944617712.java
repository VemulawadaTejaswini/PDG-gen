import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int AC=0,WA=0,TLE=0,RE=0;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i=0 ; i<n ; i++){
            String x = scanner.nextLine();
            if(x.equals("AC")) AC++;
            else if(x.equals("WA")) WA++;
            else if(x.equals("TLE")) TLE++;
            else if(x.equals("RE")) RE++;
        }

        System.out.println("AC x " + AC);
        System.out.println("WA x " + WA);
        System.out.println("TLE x " + TLE);
        System.out.println("RE x " + RE);

    }

}
