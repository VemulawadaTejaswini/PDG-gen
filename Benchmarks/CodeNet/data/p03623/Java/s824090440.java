import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputString = br.readLine().split(" ");

            int locationX = Integer.parseInt(inputString[0]);
            int locationOfRestaurantA = Integer.parseInt(inputString[1]);
            int locationOfRestaurantB = Integer.parseInt(inputString[2]);

            int distanceAtoX = getDistanceXtoRestaurant(locationX, locationOfRestaurantA);
            int distanceBtoX = getDistanceXtoRestaurant(locationX, locationOfRestaurantB);

            String closerRestaurantIs = distanceAtoX >= distanceBtoX ? "B" : "A";

            System.out.println(closerRestaurantIs);

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static int getDistanceXtoRestaurant(int locationX, int locationOfRestaurant) {
        return locationX >= locationOfRestaurant ? locationX - locationOfRestaurant : locationOfRestaurant - locationX;
    }
}