import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int cur = 0;
        int time = 0;
        while(cur < x){
            time++;
            if((x-cur) <= time || (x - cur - time) >= time){
                cur = cur+time;
            }
        }
        System.out.println(time);
    }
}

