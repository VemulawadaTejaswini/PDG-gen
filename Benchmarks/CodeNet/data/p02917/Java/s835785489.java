import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int buf1 = -1;
        int buf2 = -1;
        for(int i = 0; i < a; i++){
            if(i != a - 1){
                buf1 = sc.nextInt();
            }
            if(i == 1){
                if(buf2 <= buf1){
                    sum += (buf2 * 2);
                }else{
                    sum += buf2 + buf1;
                }
            }else if(i == a - 1){
                sum += buf1;
            }else if(buf2 >= buf1 && buf2 >= 0){
                sum += buf1;
            }else if(buf2 < buf1 && buf2 >= 0){
                sum += buf2;
            }
            //System.out.println(buf2  + " " + buf1 + " " + sum);
            buf2 = buf1;
        }
        System.out.println(sum);
    }
}