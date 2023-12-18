import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] inputfield = getInputField();
        char[][] numberField = getNumberField(inputfield);
        showField(numberField);
    }

    static public char[][] getInputField() {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        char[][] inputField = new char[h][w];
        for (int i = 0; i < inputField.length; i++) {
            String s = scanner.next();
            for (int j = 0; j < inputField[i].length; j++) {
                inputField[i][j] = s.charAt(j);
            }
        }
        scanner.close();
        return inputField;
    }

    static public char[][] getNumberField(char[][] inputField) {
        char[][] numberField = new char[inputField.length][inputField[0].length];
        for (int i = 0; i < numberField.length; i++) {
            for (int j = 0; j < numberField[i].length; j++) {
                if (inputField[i][j] == '#') {
                    numberField[i][j] = '#';
                } else {
                    numberField[i][j] = checkBombs(inputField, i, j);
                }
            }
        }
        return numberField;
    }

    static public char checkBombs(char[][] inputfield, int i, int j) {
        int count = 0;
        for (int i2 = i-1; i2 < i+2; i2++) {
            for (int j2 = j-1; j2 < j+2; j2++) {
                System.out.println("i2 = " + i2 + " j2 = " + j2);
                if (i2 < 0 || i2 >= inputfield.length) {
                } else if (j2 < 0 || j2 >= inputfield[0].length) {
                }else if (inputfield[i2][j2] == '#') {
                    count++;
                }
            }
        }
        return Integer.toString(count).charAt(0);
    }
    static public void showField(char[][] numberField) {
        for (int i = 0; i < numberField.length; i++) {
            for (int j = 0; j < numberField[0].length; j++) {
                System.out.print(numberField[i][j]);
            }
            System.out.println();
        }
    }
}
