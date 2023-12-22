import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []line = br.readLine().split(" ");

        long curr = Long.parseLong(line[0]), moves = Long.parseLong(line[1]), d = Long.parseLong(line[2]);

        curr=Math.abs(curr);

        long maxMoves = (long)curr/d;

        if(maxMoves > moves){
            curr-= moves*d;
            moves=0;
        }
        else {
            curr-= maxMoves*d;
            moves-= maxMoves;
        }

        if(moves >0){
            if(moves%2 == 0){
                System.out.println(Math.abs(curr));
            }
            else {
                if(Math.abs(curr-d) <= Math.abs(curr+d)){
                    System.out.println(Math.abs(curr-d));
                }
                else {
                    System.out.println(Math.abs(curr+d));
                }
            }
        }
        else {
            System.out.println(Math.abs(curr));
        }
    }
}