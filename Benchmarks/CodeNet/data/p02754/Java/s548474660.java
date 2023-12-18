import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int blue = stdIn.nextInt();
        int red = stdIn.nextInt();
        String s = "";
        int rb_sum = 0;
        int sum = 0;

        while(n > rb_sum){
            for(int i = 0; i < blue; i++){
                s += 'b';
            }
            for(int i = 0; i < red; i++){
                s += 'r';
            }
            rb_sum += (red + blue);
        }

        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'b'){
                sum++;
            }
        }

        System.out.println(sum);
    }
}