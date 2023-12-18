import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
        int out = 1;
        int answer = 0;

        while(out < b){
            out--;
            out += a;
            answer++;
        }

        System.out.println(answer);

    }

}
