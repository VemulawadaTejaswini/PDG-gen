import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;
    Set<String> set = new HashSet<>();
    int K;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;

        for(int i=0; i<N; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            long first = a % b;
            long constValue = d % b;
            long check = -1;
            long num = c;

            if(a < b){
                System.out.println("No");
            } else if(b > d){
                System.out.println("No");
            } else if(b <= c){
                System.out.println("Yes");
            } else if(constValue == 0 || first == 0){
                if(a % b > c){
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            } else {
//                int count = 1;
                if(first % constValue == 0){
                    check = (c/constValue+1)*constValue;
                } else {
                    check = (c/constValue+1)*constValue + first;
                    while(check >= c){
                        check-=constValue;
                    }
                    check+=constValue;
                }
//                while(true){
//                    tmp++;
////                    tmp = constValue * count;
////                    if(tmp > c){
//                    if(tmp % constValue == 0){
//                        check = tmp;
//                        break;
//                    }
////                    count++;
//                }

                if(check < b){
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        }

    }

    void substring(String s, int num){
        for(int i=1; i<=num; i++){
            if(i > K){
                break;
            }
            for(int j=0; j<num; j++){
                if(j + i-1 < num){
//                    System.out.println(s.substring(j, j+i));
                    set.add(s.substring(j, j+i));
                } else {
                    break;
                }
            }
        }
    }

    void permutation(String s, String ans){
        if(s.length() <= 1){
            System.out.println(ans + s);
        } else {
            for(int i=0; i<s.length(); i++){
                permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
            }
        }
    }
}