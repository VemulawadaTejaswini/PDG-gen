import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int H=scan.nextInt();
        int R=scan.nextInt();
        
        if(H+R>0){
        System.out.println(1);
        } else if(H+R==0){
        System.out.println(0);
        } else if(H+R<0){
        System.out.println(-1);
        }
    } 
}
