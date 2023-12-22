import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    // returns x! / (y! * z!)
    static double permutation(int x, int y, int z){
        // make y bigger than z
        if(z < y){
            int tmp = y;
            y = z;
            z = tmp;
        }

        double result = 1;
        int counter = 0;

        for(int i = y+1; i <= x; i++){
            result *= i;
            if(counter < z){
                result /= (z-counter);
                counter++;
            }
        }

        if(counter <= z-1){
            do{
                result /= (z-counter);
                counter++;
            }while(counter != z);
        }

        return result;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int r = Integer.parseInt(input[2]);

        int nm = n*m;

        if(r < nm){
            System.out.println("0");
            return;
        }

        int beads = r - nm;

        double answer = permutation(beads+n-1, beads, n-1);

        System.out.println((long)answer);
    }
}
