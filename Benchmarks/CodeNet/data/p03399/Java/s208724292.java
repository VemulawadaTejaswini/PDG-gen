import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int train = sc.nextInt();
            int trainfree = sc.nextInt();
            int bus = sc.nextInt();
            int busfree = sc.nextInt();
            int trainfee = 0;
            int busfee = 0;
            if(train > trainfree){
              trainfee = trainfree;
            } else {
              trainfee = train;
            }
            if(bus > busfree){
              busfee = busfree;
            } else {
              busfee = bus;
            }
            System.out.println(trainfee + busfee);
      }
}