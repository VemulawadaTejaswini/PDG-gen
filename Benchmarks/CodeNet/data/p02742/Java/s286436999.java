import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long h = sc.nextLong(), w = sc.nextLong();
        if(h==0||w==0){
            System.out.println(1);
        } else if(h*w%2==0){
            System.out.println(h*w/2);
        } else {
            System.out.println(h*w/2+1);
        }
    }
}