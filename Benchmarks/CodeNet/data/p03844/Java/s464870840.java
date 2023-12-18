import java.util.Scanner;

public class blah {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String thing = input.nextLine();
        String [] thingies = thing.split(" ");
        int datThing = 0;

        if (thingies[1].equals("+")) {
            datThing = Integer.parseInt(thingies[0]) + Integer.parseInt(thingies[2]);
        }
        else {
            datThing = Integer.parseInt(thingies[0]) + Integer.parseInt(thingies[2]);
        }

       System.out.println(datThing);
    }
}
