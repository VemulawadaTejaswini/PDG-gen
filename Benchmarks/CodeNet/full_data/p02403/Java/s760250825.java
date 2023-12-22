import java.io.*;

class Main {

    public static void main(String[] args) {
        int height, width;

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                String[] lines = reader.readLine().split(" ");
                height = Integer.parseInt(lines[0]);
                width  = Integer.parseInt(lines[1]);

                if (height == 0 && width == 0) {
                    break;
                }

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        System.out.print("#");
                    }
                    System.out.println();
                }
                System.out.println();
            } catch (NumberFormatException e) {
                System.out.println(e);
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}