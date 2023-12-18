import java.util.Scanner;

class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        Scanner scann = new Scanner(System.in);
        String str=scann.nextLine();
        String[] x=str.split("");


        int i=0;
        int sum=0;

        if(num%2==1){
            System.out.println("No");
        }else{


        for(i=0;i<(num/2);i++){
            if(x[i].equals(x[i+(num/2)])){
                continue;
            }
            sum=sum+1;
        }
        
        if(sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        }
        
    }
}