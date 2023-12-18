import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int list[] = {A,B,C};
        Arrays.sort(list);
        int cnt =0;
        while(true) {
            if (list[2] != list[1] && list[0] <list[2]){
                list[0] ++;
                list[1] ++;
            }else if (list[0] < list[2]){
                list[0] += 2;
            }else if (list[0] >list[2]){
                list[1]++;
                list[2]++;
            }else if (list[0] == list[1] && list[2] ==list[1] ){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
