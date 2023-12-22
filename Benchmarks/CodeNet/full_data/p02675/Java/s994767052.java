import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int ones = num % 10;
        if (ones==2 || ones==4 || ones==5 || ones==7 || ones==9){
			System.out.println("hon");} 
        else if(ones==0 || ones==6 || ones==1 || ones==8){
			System.out.println("pon");}
        else if(ones==3){
            System.out.println("bon");}
        scan.close();
    }
}

