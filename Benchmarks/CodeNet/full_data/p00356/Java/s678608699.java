import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Fraction {
    int num;
    int denom;

    Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;

        reduction();
    }

    void reduction() {
        int gcdA = gcd(num, denom);
        num /= gcdA;
        denom /= gcdA;
    }

    int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    void add(Fraction fraction) {
        num = fraction.denom * num + fraction.num * denom;
        denom *= fraction.denom;

        reduction();
    }

    void mul(Fraction fraction) {
        num *= fraction.num;
        denom *= fraction.denom;

        reduction();
    }

    double value() {
        return (double) num / denom;
    }

}

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int x = Integer.parseInt(line[0]);
        int y = Integer.parseInt(line[1]);

        Fraction posX = new Fraction(0, 1);
        Fraction posY = new Fraction(0, 1);

        Fraction diffX = new Fraction(1, y);
        Fraction diffY = new Fraction(1, 2 * x);

        int result = 0;

        while (posX.value() <= 2 * x) {
            if (posX.denom == 1 && (posX.num % 2 == 0)) {
                result++;
            } else if (posY.denom == 1){
                result++;
            }
            posX.add(diffX);
            posY.add(diffY);
        }

        // wrong.
        // int result = x + 1 + y + 1 - gcd(2 * x, y) - 1;

        System.out.println(result);
    }
}
