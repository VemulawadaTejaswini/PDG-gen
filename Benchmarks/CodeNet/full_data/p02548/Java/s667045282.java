import java.util.Scanner;

public class Main {
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        long answer=scan.nextInt();
        Integer i;
        Integer j;
        Integer z;
        long count=0;
        for(i=1;i<=answer;i++){
            for(j=1;j<answer;j++){
                for(z=1;z<=answer;z++){
                    if(i*j+z==answer){
                        count=count+1;
                    }
                }
            }
        }
        System.out.println(count);
    }
    
    public static void main(String args[]){
        Main printer = new Main();
        printer.run(args);
    }
}