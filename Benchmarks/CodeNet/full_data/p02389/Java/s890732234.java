import java.util.Scanner;
class Main {
    int a,b; 
    public void kami(){
            Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println(a * b + " " + (a + b) * 2);   
    }

    public static void main(String[] args) {
        new Main().kami();
    }

}