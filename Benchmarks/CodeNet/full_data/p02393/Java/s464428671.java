import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int max=0 ,mid=0 ,min=0;
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        max = a;
        if(b > max){
            max = b;
            if(a > c){
                mid = a;
                min = c;
            }else{
                mid = c;
                min = a;
            }
        }
        if(c > max){
            max = c; 
            if(a > b){
                mid = a;
                min = b;
            }else{
                mid = b;
                min = a;
            }
        }
        System.out.println(min+" "+mid+" "+max);
        scan.close();
    }
}
