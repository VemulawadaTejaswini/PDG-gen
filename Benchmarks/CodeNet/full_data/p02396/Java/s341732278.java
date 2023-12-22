import java.util.Scanner;

class Main{
    int i, x;
    public void aaaa(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for(i = 1; x != 0; i++){
            System.out.println("Case " + i + ": " + x);
            x = sc.nextInt();
        }
    }
        public static void main(String[] args){
            new Main().aaaa();
        }
        
}