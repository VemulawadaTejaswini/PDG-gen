import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        
        int b = scanner.nextInt();
        int goukei = b;
        int saishou=b, saidai=b;
        for (int i = 1; i <= a-1; i++) {
            b = scanner.nextInt();
            goukei = b + goukei;
            if(saishou>b){
                saishou=b;
            }
            if(saidai<b){
                saishou=b;
            }
        }
        System.out.println(saishou+" "+saidai+" "+goukei);
    }
}