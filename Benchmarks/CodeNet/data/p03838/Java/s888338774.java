import java.util.*;
//AGC008A
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int div;
        if(x > 0){
            if(y > 0){
                div = y-x;
                if(div<0)div = div * (-1) + 2;
            }else{
                y *= -1;
                div = y-x;
                if(div < 0)div *= -1;
                div++;
            }
        }else{
            if(y > 0){
                x *= -1;
                div = x-y;
                if(div<0)div = div*(-1);
                div++;
            }else{
                if(x > y){
                    div = x-y+2;
                }else{
                    div = y-x;
                }
            }
        }
        System.out.println(div);
    }
}