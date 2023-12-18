import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        int n=stdIn.nextInt();
        int k=stdIn.nextInt();
        int a=n;
        int count=0; //桁数
        while(a>0){
            a=a/k;
            count++;
        }
        System.out.print(count);
        
    }

}