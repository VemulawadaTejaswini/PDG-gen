import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int flag = 0;
        int answer = 0;
        for(int i = 1;i<1000000000;i++){
            if(i % 2 == 0 && i % a == 0){
                flag++;
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }
}