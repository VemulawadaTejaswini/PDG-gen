import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        String peopleDirections = sc.next();

        int minimumNumberOfPeopleToChangeDirection = numberOfPeople;
        for (int i = 0; i < peopleDirections.length(); i++) {

            int countOfEast = 0;
            if (i < peopleDirections.length() - 1) {
                for (char c : peopleDirections.substring(i + 1).toCharArray()) {
                    if (c == 'E') {
                        countOfEast++;
                    }
                }
            }

            int countOfWest = 0;
            if (i > 0) {
                for (char c : peopleDirections.substring(0, i).toCharArray()) {
                    if (c == 'W') {
                        countOfWest++;
                    }
                }
            }

            int totalCount = countOfEast + countOfWest;
            if (minimumNumberOfPeopleToChangeDirection > totalCount) {
                minimumNumberOfPeopleToChangeDirection = totalCount;
            }

        }

        System.out.println(minimumNumberOfPeopleToChangeDirection);
    }
}
