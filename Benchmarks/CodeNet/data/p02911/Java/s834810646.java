import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int points[] = new int[sc.nextInt()];
        int startPoint = sc.nextInt();
        int correctNum = sc.nextInt();

        for(int i = 0;  i< points.length; i++){
            points[i] = startPoint;
        }

        for(int i = 0; i < correctNum; i++){
            int answer = sc.nextInt() - 1 ;

            for(int j = 0;  j< points.length; j++){
                if(j != answer){
                    points[j] -= 1;
                }
            }
        }

        for(int i = 0;  i< points.length; i++){
            if(points[i] > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}
