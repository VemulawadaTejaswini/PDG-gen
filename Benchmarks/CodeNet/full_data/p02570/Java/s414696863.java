import java.util.Scanner;

public class Main {
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        Integer m=scan.nextInt();
        Integer time=scan.nextInt();
        Integer speed=scan.nextInt();
        if(m<=time*speed){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}