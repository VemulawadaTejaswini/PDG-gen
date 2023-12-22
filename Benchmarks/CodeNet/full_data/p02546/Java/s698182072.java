import java.util.Scanner;

public class Main {
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        String print;
        String[] lines=line.split("");
        if(lines[lines.length-1].equals("s")){
            print=line+"es";
        }
        else{
            print=line+"s";
        }
        System.out.println(print);
    }
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}