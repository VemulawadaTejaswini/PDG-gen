
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] friendliness = new int[n];
        String[] s = br.readLine().split(" ");
        long answer = 0L;
        for(int i=0;i<n;i++){
            friendliness[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(friendliness);
        int max = friendliness[n-1];
        int secondMax = friendliness[n-2];

        answer += max;
        int counter = 0;
        for (int i = n-3;i>=0;i--){
            ++counter;
            if(counter == 2){
                secondMax = friendliness[i+2];
                counter = 0;
            }
            answer += secondMax;
        }

        System.out.println(answer);
    }