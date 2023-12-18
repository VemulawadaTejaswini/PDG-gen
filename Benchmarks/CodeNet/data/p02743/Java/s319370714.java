import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        if(a<0){
            System.out.println("No");
            if(b<0){
                System.out.println("No");
            }
            if(c<0){
                System.out.println("No");
            }
        }
        if(b<0){
            System.out.println("No");
            if(a<0){
                System.out.println("No");
            }
            if(c<0){
                System.out.println("No");
            }
        }
        if(c<0){
            System.out.println("No");
            if(b<0){
                System.out.println("No");
            }
            if(a<0){
                System.out.println("No");
            }
        } 
        if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}