import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int num_ball=scan.nextInt();
        int color=scan.nextInt();
        int answer=color;
        int i;
        for(i=1;i<num_ball;i++){
            answer*=(color-1);
        }
        System.out.println(answer);
    }
}