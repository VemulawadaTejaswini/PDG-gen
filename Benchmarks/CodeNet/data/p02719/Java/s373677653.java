import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt();
        int y=stdIn.nextInt();
        
        int t=x%y;
    
        if(t>=-(t-y)){
            System.out.println(Math.abs(t-y));
            
        }
        else{
            System.out.println(Math.abs(t));
            
        }
    }
}