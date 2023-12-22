import java.util.Scanner;
public class Main {
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        Integer x;
        Integer print;
        x=scan.nextInt();
        if(x==0){
            System.out.println(1);
        }
        else if(x==1){
            System.out.println(0);
        }
    }
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}