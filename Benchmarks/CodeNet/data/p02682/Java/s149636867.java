import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Amax = scan.nextInt();
        int Bmax = scan.nextInt();
        int Cmax = scan.nextInt();
        int kosu = scan.nextInt();
		int Akosu = 0;
        int Bkosu = 0;
        int Ckosu = 0;
        if (Amax < kosu) {
          Akosu = Amax;
          if ((Amax + Bmax) < kosu) {
            Bkosu = Bmax;
            Ckosu = kosu - Bmax - Amax;
          } else {
            Bkosu = kosu - Amax;
          }
        } else {
          Akosu = kosu;
        }
        System.out.println(Akosu - Ckosu);
    }
}