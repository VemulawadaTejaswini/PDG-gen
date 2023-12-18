
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPerson = sc.nextInt();
        Boolean judgeFlag = false;
        int count = 0;

        for(int i=0; i<totalPerson; i++){
            int person = sc.nextInt();
            for(int j=0; j<person; j++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                if(y == 0){ judgeFlag = true; }
            }
            if(judgeFlag != true){ count++;
            }else{ judgeFlag = false; }
        }
        System.out.println(count);
    }
}