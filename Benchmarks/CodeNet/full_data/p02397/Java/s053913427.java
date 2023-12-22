import java.util.Scanner;
class Main{
    int x, y, z = 0;
    public void aaaa(){
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        while(z == 0){
            if (x < y){
                System.out.println(x + " " + y);
            }else{
                System.out.println(y + " " + x);
            }
            x = sc.nextInt();
            y = sc.nextInt();
            if(x == 0 && y == 0){
                z++;
            }
        }
        
    }
    public static void main(String[] args){
        new Main().aaaa();
    }
        
}