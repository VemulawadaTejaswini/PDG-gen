import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextInt();
        long W = sc.nextInt();


       if(H%2==0){
         System.out.println((H/2)*W);
       }else if(H%2!=0&&W%2==0){
         System.out.println((H/2)*W/2+(H/2-1)*W/2);
       }else if(H%2!=0&&W%2!=0){
         System.out.println((H/2)*W/2+(H/2-1)*(W/2-1));
       }




    }
}
