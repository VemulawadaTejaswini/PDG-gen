import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i=0;

        for(int j=1; j<10000; j++){
            i = sc.nextInt();            
            if(i==0) return;
            System.out.println("Case "+j+": "+i);
        }
    }
}