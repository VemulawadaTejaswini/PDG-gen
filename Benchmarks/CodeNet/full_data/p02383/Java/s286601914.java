import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Dice dice = new Dice(br.readLine().split(" "));
        String operations = br.readLine();

        for (int i = 0; i < operations.length(); i++) {
            dice.roll(operations.charAt(i));
        }

        System.out.println(dice.getTopFace());

    }
}

class Dice {
    private int[] dice = new int[6];

    Dice (String[] num) {
        for (int i = 0; i < 6; i++) {
            dice[i] = Integer.parseInt(num[i]);
        }
    }

    public void roll (char direction) {
        int temp;
        switch (direction) {
            case 'N':
            temp = dice[0];
            dice[0] = dice[1];
            dice[1] = dice[5];
            dice[5] = dice[4];
            dice[4] = temp;
            break;

            case 'S':
            temp = dice[0];
            dice[0] = dice[4];
            dice[4] = dice[5];
            dice[5] = dice[1];
            dice[1] = temp;
            break;

            case 'E':
            temp = dice[0];
            dice[0] = dice[3];
            dice[3] = dice[5];
            dice[5] = dice[2];
            dice[2] = temp;
            break;

            case 'W':
            temp = dice[0];
            dice[0] = dice[2];
            dice[2] = dice[5];
            dice[5] = dice[3];
            dice[3] = temp;
            break;
        }
    }

    public int getTopFace () {
        return dice[0];
    }
}