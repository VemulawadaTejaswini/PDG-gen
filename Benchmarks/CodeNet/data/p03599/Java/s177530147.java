public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt() * 100, b = scanner.nextInt() * 100, c = scanner.nextInt(), d = scanner.nextInt(), e = scanner.nextInt(), f = scanner.nextInt();
        double water, suger, maxWater = 0, maxSuger = 0, maxConcentration = 0;

        for (int i = 0; a * i <= f; i++) {
            for (int j = 0; a * i + b * j <= f; j++) {
                water = a * i + b * j;
                for (int k = 0; k * c <= f - water; k++) {
                    for (int l = 0; k * c + l * d <= f - water; l++) {
                        suger = k * c + l * d;
                        if (water / 100 * e >= suger && maxConcentration <= suger / (water + suger)) {
                            maxWater = water;
                            maxSuger = suger;
                            maxConcentration = suger / (water + suger);
                        }
                    }
                }
            }
        }

        System.out.println((int)(maxWater + maxSuger) + " " + (int)maxSuger);
    }
}