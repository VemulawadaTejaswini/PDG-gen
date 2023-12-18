import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt();

        int sum=0;
        for(int i=0; i<x; i++){
            if((i+1)%3!=0&&(i+1)%5!=0){
                sum+=i+1;
            }
        }
        System.out.println(sum);
        
        
        
    }

}