import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int scoreT = 0, scoreH = 0;
            for(int i = 0; i < num; i++){
                String strT = sc.next();
                String strH = sc.next();
                if((strT.compareTo(strH)) == 0){
                    scoreT += 1;
                    scoreH += 1;
                }
                else if((strT.compareTo(strH)) > 0){
                    scoreT += 3;
                }
                else scoreH += 3;
            }
            System.out.println(scoreT +" "+ scoreH);
    }
}
