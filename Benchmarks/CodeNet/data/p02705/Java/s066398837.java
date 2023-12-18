import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        double x;
        double y=Math.PI;
        do{
            System.out.print("半径は");
            
           x=stdIn.nextInt(); 
        }while(x<=1&&x>=100);
        
        System.out.println("円周は"+x*2*y);
        
    }

}