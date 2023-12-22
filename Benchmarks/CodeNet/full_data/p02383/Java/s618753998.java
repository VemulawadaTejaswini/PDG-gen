import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String cmd;
        char c;
        int[] label;
        int temp;
        Scanner sc = new Scanner(System.in);
        label = new int[6];
        for (int i = 0; i < 6; i++)
            label[i] = sc.nextInt();
        cmd = sc.next();

        for (int i = 0; i < cmd.length(); i++) {
            c = cmd.charAt(i);
            switch (c) {
            case 'N':
                temp = label[0];
                label[0] = label[1];
                label[1] = label[5];
                label[5] = label[4];
                label[4] = temp;
                break;
            case 'S':
                temp = label[0];
                label[0] = label[4];
                label[4] = label[5];
                label[5] = label[1];
                label[1] = temp;
                break;
            case 'W':
                temp = label[0];
                label[0] = label[2];
                label[2] = label[5];
                label[5] = label[3];
                label[3] = temp;
                break;
            case 'E':
                temp = label[0];
                label[0] = label[3];
                label[3] = label[5];
                label[5] = label[2];
                label[2] = temp;
                break;
            }
        }
        System.out.println(label[0]);
    }
}
