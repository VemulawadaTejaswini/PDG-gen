import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextInt();
        long W = sc.nextInt();
       long a=(H+1)/2;
       long b=(W+1)/2;
       if(H%2==0){
         System.out.println((H/2)*W);
       }else if(H%2!=0&&W%2==0){
         System.out.println(a*W/2+(a-1)*W/2);
       }else if(H%2!=0&&W%2!=0){
         System.out.println(a*(b)+(a-1)*(b-1));
       }else if(H==1&&W==1){
         System.out.println(1);
       }else if(H%2==0&&W==1){
         System.out.println(H/2);
       }else if(H%2!=0&&W==1){
         System.out.println(a);
       }




    }
}
