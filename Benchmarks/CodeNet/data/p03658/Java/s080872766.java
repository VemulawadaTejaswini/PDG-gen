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
        int n = sc.nextInt();
int k = sc.nextInt();
int[] array = new int[n];

for(int i=0; i<n; i++){
array[i] = sc.nextInt();
}

Arrays.sort(array);

int sum = 0;

for(int i=0; i<k; i++){
sum+= array[i];
}

System.out.println(sum);
    }

}
