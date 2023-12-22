import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int x = 1;
        int y = 1;
        
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            
            if(x <= y && (x != 0 || y != 0)){
                System.out.println(x + " " + y);
            }else if(x > y && (x != 0 || y != 0)){
                System.out.println(y + " " + x);
            }else{
                break;
            }
        }
    }
}
