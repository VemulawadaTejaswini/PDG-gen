import java.util.*;

class Main {

    static void solve (int [] data) {
        int [][] triangle = new int[10][10];
        triangle[0] = data;

        for(int i = 1; i < 10; i++) {
            for(int j = 0; j < 10 - i; j++) {
                triangle[i][j] = ( triangle[i-1][j] + triangle[i-1][j+1] ) % 10;
            }
        }

        System.out.println(triangle[9][0]);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int[] data = new int[10];
        
        while(sc.hasNext()) {
            char[] line = sc.nextLine().toCharArray();
            for(int i = 0; i < 10; i++ ){
                data[i] = Integer.parseInt( "" + line[i]);
            }
            solve(data);
        }

    }
}