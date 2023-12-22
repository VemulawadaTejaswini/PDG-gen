import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Dice {
    int first, second, third, fourth, fifth, sixth;

    Dice(int[] diceval) {
        this.first = diceval[0];
        this.second = diceval[1];
        this.third = diceval[2];
        this.fourth = diceval[3];
        this.fifth = diceval[4];
        this.sixth = diceval[5];
    }

    void N() {
        int temp = this.fifth;
        this.fifth = this.first;
        this.first = this.second;
        this.second = this.sixth;
        this.sixth = temp;
    }

    void S() {
        int temp = this.second;
        this.second = this.first;
        this.first = this.fifth;
        this.fifth = this.sixth;
        this.sixth = temp;
    }

    void E() {
        int temp = this.third;
        this.third = this.first;
        this.first = this.fourth;
        this.fourth = this.sixth;
        this.sixth = temp;
    }

    void W() {
        int temp = this.fourth;
        this.fourth = this.first;
        this.first = this.third;
        this.third = this.sixth;
        this.sixth = temp;
    }
}

public class Main {
    static int[] stringToInt(String[] str) {
        int elements[] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            elements[i] = Integer.parseInt(str[i]);
        }
        return elements;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] elements = stringToInt(br.readLine().split(" "));
        char[] direction = br.readLine().toCharArray();

        Dice dice = new Dice(elements);
        for (int i = 0; i < direction.length; i++) {
            switch (direction[i]) {
            case 'N':
                dice.N();
                break;
            case 'S':
                dice.S();
                break;
            case 'E':
                dice.E();
                break;
            case 'W':
                dice.W();
                break;
            default:
                break;
            }
        }
        System.out.println(dice.first);
    }
}