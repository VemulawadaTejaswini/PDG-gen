import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(tokens -> {
                    int height = tokens[0];
                    int width = tokens[1];
                    if (height == 0 && width == 0) {
                        return;
                    }
 
                    for (int h = 0; h < height; h++) {
                        for (int w = 0; w < width; w++) {
                             if (h == 0 || h == height - 1 || w == 0 || w == width - 1) {
                                 System.out.print("#");
                             } else {
                                 System. out. println(".");
                             }
                        }
                        System.out.println();
                    }
                    System.out.println();
                });
        }
    }
}