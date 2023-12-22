import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (in.hasNext()) {
            int lenH = in.nextInt();
            int lenW = in.nextInt();

            if (lenH == 0) {
                break;
            }

            char[][] wallDef = {
            		{'#', '.'},
            		{'.', '#'}
            };
            for (int hPos = 0; hPos < lenH; hPos++) {
                for (int wPos = 0; wPos < lenW; wPos++ ) {
                	sb.append(wallDef[hPos % 2][wPos % 2]);
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}