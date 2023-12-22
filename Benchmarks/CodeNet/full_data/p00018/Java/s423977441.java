3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
 
        String[] inputArray = input.readLine().split(" ");
        ArrayList<Integer> inputList = new ArrayList<>();
        for (String each : inputArray) {
            inputList.add(Integer.parseInt(each));
        }
        Collections.sort(inputList);
        Collections.reverse(inputList);
        System.out.println(inputList.get(0) + " " + inputList.get(1) + " " + inputList.get(2) + " "
                + inputList.get(3) + " " + inputList.get(4));
    }
}
 