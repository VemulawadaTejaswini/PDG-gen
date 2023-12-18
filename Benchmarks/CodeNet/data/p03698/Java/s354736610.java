import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.next().toCharArray();
Set<String> set = new HashSet<>();


for(int i=0; i<array.length; i++){
set.add(array[i]);
}

if(set.size() == array.length) System.out.println("yes");
else System.out.println("no");
    }

}
