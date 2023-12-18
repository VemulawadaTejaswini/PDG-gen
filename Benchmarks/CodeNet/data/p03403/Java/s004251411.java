import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ko-sasaki on 2018/03/25.
 *
 * @author ko-sasaki
 */
public class Main {
    private int row;
    private List<Integer> spots = new ArrayList<>();

    public Main(Scanner s) {
        this.row = s.nextInt();
        this.spots.add(0);
        for(int i = 0 ; i < this.row; i++){
            this.spots.add(s.nextInt());
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main main = new Main(s);
        main.exec();
    }

    private void exec(){
        for(int i = 1; i <= this.row ; i++){
            this.calcPath(i);
        }
    }

    private void calcPath(int ignorePathNumber){

        int before = 0;
        int after = 0;
        int calc = 0;
        for(int i = 1 ; i < this.spots.size();i++){
            if(i == ignorePathNumber){
                continue;
            }
            after = this.spots.get(i);
            calc += Math.abs(after - before);
            before = after ;
        }

        calc += Math.abs(0 - before);
        System.out.println(calc);

    }

}