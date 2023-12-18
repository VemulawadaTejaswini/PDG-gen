import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int x =scn.nextInt();
        for(int i=1;;i++){
            if(x<i*i){
                System.out.println((i-1)*(i-1));
                break;
            }
        }
    }
}
