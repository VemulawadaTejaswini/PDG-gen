import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int num=0;
        for(int i=0;i<z;i++){
            if(x+i>y){
                break;
            }
            if(x+i==y-z+1){
                num=x+i;
            }
            System.out.println(x+i);
        }

        for(int i=0;i<z;i++){
            if(z>y||x==y){
                break;
            }
            if(!(num==y-z+i+1)){
            System.out.println(y-z+i+1);                

            }
        }
    }
}