import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int a=stdIn.nextInt();
        int b=stdIn.nextInt();
        int c=stdIn.nextInt();
        int d=stdIn.nextInt();

        do{
            c=c-b;
            if(c>0){
                a=a-d;
            }
        }while(a>0&&c>0);

        if(c>0){
            System.out.println("No");
            
        }
        else{
            System.out.println("Yes");
            
        }
        
        
    }

}