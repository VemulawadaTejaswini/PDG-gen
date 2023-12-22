import java.util.Scanner;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
double r = scan.nextDouble();
double pai=3.141592653589;
double men =r*r*pai;
double naga= r*2*pai;

  System.out.println(String.format("%.6f", men)+" "+String.format("%.6f", naga));
}
}

