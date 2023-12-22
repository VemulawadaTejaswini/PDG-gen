import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] cards = new boolean[4][13]; //false
        //[0]:S, [1]:H, [2]:C, [3]:D
        for (int i=0; i<n; i++){
            String[] ln = br.readLine().split(" ");
            String pic = ln[0];
            int num = Integer.parseInt(ln[1]) - 1;
            if ("S".equals(pic)){
                cards[0][num] = true;
            }else if ("H".equals(pic)){
                cards[1][num] = true;
            }else if ("C".equals(pic)){
                cards[2][num] = true;
            }else{
                cards[3][num] = true;
            }
        }
        for (int j=0; j<4; j++){
            for (int k=0; k<13; k++){
                if (!cards[j][k]){
                    switch (j){
                    case 0:
                        System.out.print("S ");
                        System.out.println(k+1);
                        continue;
                    case 1:
                        System.out.print("H ");
                        System.out.println(k+1);
                        continue;
                    case 2:
                        System.out.print("C ");
                        System.out.println(k+1);
                        continue;
                    case 3:
                        System.out.print("D ");
                        System.out.println(k+1);
                        continue;
                    }
                }
            }
        }
    }
}