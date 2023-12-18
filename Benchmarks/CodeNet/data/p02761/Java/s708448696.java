import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int N = Integer.parseInt(lines[0]);
        int M = Integer.parseInt(lines[1]);

        String[] sample = new String[N];
        for(int i = 0; i < N; i++){
            sample[i] = "a";
        }

        String result = "";

        for(int i = 0; i < M; i++){
            String[] line = sc.nextLine().split(" ");
            int s = Integer.parseInt(line[0]);
            String c = line[1];
            if(sample[s - 1] != "a"){
                result = "-1";
                break;
            }

            sample[s - 1] = c;
        }
        
        sc.close();

        StringBuilder sb = new StringBuilder();
        if(sample[0] == "0"){
            result = "-1";
        } else {
            for(int i = 0; i < N; i++){
                sb.append(sample[i]);
            }
        }

        String sampleVal = sb.toString().replaceAll("a", "0");
        
        System.out.println(sampleVal);
    }
}