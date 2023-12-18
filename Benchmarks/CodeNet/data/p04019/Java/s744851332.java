import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        int cNS=0;
        int cEW=0;
        for (int i = 0; i < x.length(); i++) {
            switch(x.charAt(i)){
                case 'N':
                    cNS ++;
                    break;
                case 'S':
                    cNS --;
                    break;
                case 'E':
                    cEW ++;
                    break;
                case 'W':
                    cEW--;
                    break;
            }
        }
        if(cEW==0 && cNS==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}