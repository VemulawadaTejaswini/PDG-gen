import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        for(int i=0;i<z;i++){
            if(i==z-1||x+i>y){
                break;
            }
            System.out.println(x+i);
        }

        for(int i=0;i<z;i++){
            if(z>y){
                break;
            }
            System.out.println(y-z+i+1);
        }
    }
}