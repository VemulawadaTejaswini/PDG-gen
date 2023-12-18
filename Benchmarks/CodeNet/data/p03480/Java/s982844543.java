import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        String sis = sc.nextLine();
        int isis = sis.length();
        char cx = sis.charAt(0);
        int i=1;
        for(;;i++){
            if(sis.charAt(i)!=cx){
                break;
            }
        }
        System.out.println(isis-i);
    }
}
