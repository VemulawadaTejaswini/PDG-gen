import java.util.Scanner;

public class Main{
    void run(String[] args){
        Scanner scan=new Scanner(System.in);
        long answer=scan.nextInt();
        Integer i;
        Integer j;
        Integer z;
        Integer sum;
        long count=0;
        for(i=1;i<=answer;i++){
            for(j=1;j<(answer-1)/i;j++){
                for(z=1;z<=answer;z++){
                    if(i*j+z==answer){
                        count=count+1;
                        break;
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
