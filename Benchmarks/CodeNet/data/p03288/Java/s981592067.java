import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R;
        
        do {
            R = sc.nextInt();
        }while(!(R>=0 && R<=4208));



        if (R<1200){
            System.out.println("ABC");

        } else if (R>=1200 && R<=2800){
            System.out.println("ARC");
        } else{
            System.out.println("AGC");
        }
        
    }
}
