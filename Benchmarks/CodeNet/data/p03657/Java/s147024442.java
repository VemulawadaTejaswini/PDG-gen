import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            br.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(tokens -> {
                    int a = toknes[0];
                    int b = toknes[1];
                	if((a%3)||(b%3)||((a+b)%3))System.out.println("Possible");
                	else System.out.println("Impossible");
                });
        }
    }
}