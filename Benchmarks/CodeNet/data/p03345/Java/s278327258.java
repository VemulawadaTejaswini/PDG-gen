import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc = new Scanner(System.in);
       long a = sc.nextLong();
       long b = sc.nextLong();
       long c = sc.nextLong();
       long k = sc.nextLong();
       long[] number = {a,b,c};
       long[] tmp = new long[3];
       
       for(int i = 0; i < k; i++){
           for(int j = 0; j < number.length; j++){
            switch(j){
                case 0:
                    tmp[0] = number[1] + number[2];
                    break;
                case 1:
                    tmp[1] = number[0] + number[2];
                    break;
                case 2:
                    tmp[2] = number[0] + number[1];
                    break;
            }
            if(j == 2){
                number[0] = tmp[0];
                number[1] = tmp[1];
                number[2] = tmp[2];
            }
           }
       }
       System.out.println(number[0] - number[1]);
    }
}
