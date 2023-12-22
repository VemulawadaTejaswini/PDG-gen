import java.io.*;

class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        try {

            String[] line = reader.readLine().split(" ");

            int[] data = new int[line.length];

            // W = data[0], H = data[1],
            // x = data[2], y = data[3], r = data[4] ??¨?????????
            for (int i = 0; i < data.length; i++) {
                data[i] = Integer.parseInt(line[i]);
            }
            
            if (data[2] + data[4] <= data[0] && data[3] + data[4] <= data[1]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}