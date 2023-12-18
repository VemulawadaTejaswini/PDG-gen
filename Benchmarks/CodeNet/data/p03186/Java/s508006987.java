import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int untastyAntidote = Integer.parseInt(sc.next());
    int tastyAntidote = Integer.parseInt(sc.next());
    int tastyPoison = Integer.parseInt(sc.next());
    sc.close();

    int health = 1;

        if (tastyPoison == 0) {
                    return tastyAntidote;
                } else if (untastyAntidote == 0 && tastyAntidote == 0 && tastyPoison == 1) {
                    return tastyPoison;
                } else if (tastyAntidote >= tastyPoison) {
                    return tastyAntidote + tastyPoison;
                } else if (untastyAntidote >= tastyPoison) {
                    return tastyPoison;
                } else if (tastyPoison > untastyAntidote) {
                    return untastyAntidote + 1;
                }

        int tastyEaten = 0;

        while (health >= 0) {

            if (health == 0) {
                if (tastyAntidote > 0) {
                                    tastyAntidote--;
                                    health++;
                                    tastyEaten++;
                                } else if (untastyAntidote > 0) {
                                    untastyAntidote--;
                                    health++;
                                } else {
                                    break;
                                    }
            } else if (health > 0) {
                if (tastyPoison > 0) {
                    tastyPoison--;
                    tastyEaten++;
                    health--;
                } else if (tastyAntidote > 0) {
                    tastyAntidote--;
                    tastyEaten++;
                } else if (tastyAntidote == 0) {
                    break;
                } if (tastyPoison == 0) {
                                      break;
                                  }
            }
        }

        System.out.println(tastyEaten);
  }
}