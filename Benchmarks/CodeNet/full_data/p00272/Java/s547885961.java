import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            switch(scan.nextInt()){
                case 1:
                    System.out.println(scan.nextInt() * 6000);
                    break;
                case 2:
                    System.out.println(scan.nextInt() * 4000);
                    break;
                case 3:
                    System.out.println(scan.nextInt() * 3000);
                    break;
                default:
                    System.out.println(scan.nextInt() * 2000);
                    break;
            }
        }
        scan.close();
    }
}
