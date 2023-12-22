import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        int grade_T = 0, grade_H = 0;
        for(int i = 0; i < cnt; i ++ ){
            String sub_T = input.next();
            String sub_H = input.next();
            if(sub_T.compareTo(sub_H) < 0)
                grade_H += 3;
            if(sub_T.compareTo(sub_H) == 0){
                grade_T ++;
                grade_H ++;
            }
            if(sub_T.compareTo(sub_H) > 0)
                grade_T += 3;
        }
        System.out.println(grade_T + " " + grade_H);
    }
}
