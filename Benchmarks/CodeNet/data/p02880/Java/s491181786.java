import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("TaskB.out");
        HashSet<Integer> combos = new HashSet<>();
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                combos.add(i*j);
            }
        }
        int n = sc.nextInt();
        if(combos.contains(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}