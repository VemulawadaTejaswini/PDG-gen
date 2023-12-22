import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =0;
        while(true){
            n++;
            int k=sc.nextInt();
            if(n>9999){
                System.out.println("Too Large");
                System.exit(-1);
            }
            if(k<1 || 10000<k){
                System.out.println("There is an incorrect number");
                System.exit(-1);
            }
            if(k==0){
              break;
            }
            System.out.println("case "+n+": "+k);
        }
    }
}