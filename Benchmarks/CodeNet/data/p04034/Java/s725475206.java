import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstLine = br.readLine();
        String[] firstSplit = firstLine.split(" ");
        int N = Integer.parseInt(firstSplit[0]);
        int Q = Integer.parseInt(firstSplit[1]);

        Box[] boxes = new Box[N];
        for(int i = 0; i<N; i++) boxes[i] = new Box();
        boxes[0].hasRed = true;

        for(int i = 0; i<Q; i++){
            String line = br.readLine();
            String[] split = line.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            a--;
            b--;

            if(boxes[a].hasRed){
                if(boxes[a].balls == 1) boxes[a].hasRed = false;
                boxes[b].hasRed = true;
            }
            boxes[a].balls--;
            boxes[b].balls++;
        }

        //count
        int total = 0;
        for(Box b : boxes){
            if(b.hasRed) total++;
        }
        System.out.println(total);
    }
}

class Box{
    int balls;
    boolean hasRed;
    Box(){
        balls = 1;
        hasRed = false;
    }
}