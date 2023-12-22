import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        int[] side = Integer.parseInt(line.split(" "));
        
        int area = side[0] * side[1];
        int areaLength = ( side[0] + side[1] ) * 2;

        System.out.println(area + " " + areaLength);
    }
}