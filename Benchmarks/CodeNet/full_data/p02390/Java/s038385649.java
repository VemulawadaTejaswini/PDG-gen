import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int time = scan.nextInt();
        int h = time / 3600;
        int m = (time - 3600*h) / 60;
        int s = (time - 3600*h - 60*m);
        
        if(s >= 60){
            s = 59;
        }
        if(m >= 60){
            m = 59;
        }
        System.out.println(h +":"+ m +":"+ s);
    }
}
