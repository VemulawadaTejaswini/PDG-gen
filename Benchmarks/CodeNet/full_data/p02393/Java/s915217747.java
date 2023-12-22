import java.util.Scanner;
class Main {
      
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        // TODO Auto-generated method stub
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
          
        if(a > b){
            x = a;
            a = b;
            b = x;
            }
        if(b > c){
            x = a;
            a = b;
            b = x;
            }
        if(a > b){
            x = a;
            a = b;
            b = x;
            }
            System.out.println(a+" "+b+""+c);
    }
  
}