import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        for(int i = 1; true; i++){
            x = sc.nextInt();
            if(x == 0){
                break;
            }
            System.out.println("Case " + i + ": " + x);
        }
    }
}
