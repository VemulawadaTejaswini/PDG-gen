import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numa = scan.nextInt();
        int numb = scan.nextInt();
        int numc = scan.nextInt();
        int numd = scan.nextInt(); 
        int i;
        for(i=0;i<100;i++){
            if(i%2 == 0){
                if(numc>0){
                    numc = numc - numb;}
                else{
                    System.out.println("yes");
                    break;}
                }
            else if(i%2 == 1){
                if(numa>0){
                    numa = numa - numd;}
                else{
                    System.out.println("no");
                    break;}
                }        
          }        
        scan.close();
    }
}