import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        int hoge2 = sc.nextInt();
        int sum = 0;

        if(hoge == 1 && hoge2 == 1){
            sum+=400000;
        }
            
        if(hoge ==1){
            sum += 300000;
        }
        if(hoge == 2){
            sum+= 200000;
        }
        if(hoge == 3){
            sum += 100000;
        }
        if(hoge2 == 1){
            sum += 300000;
        }
        if(hoge2 == 2){
            sum+= 200000;
        }
        if(hoge2 == 3){
            sum += 100000;
        }
        System.out.println(sum);
    }     
}