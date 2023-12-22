import java.util.Scanner;
class Main {

    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, b, c;
        a = x.nextInt(); b = x.nextInt(); c = x.nextInt();
        if(a >= 0 && a<= 1000 && b >= 0 && b<= 1000 && c >= 0 && b<= 1000){
            if(a < b && b < c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        
        }
    }
}