import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int pien=1000;
        int otsuri=0;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int amari = N%pien;
        if(amari != 0){
             otsuri = pien-amari;
        }else{
            otsuri = amari;
        }
        System.out.println(otsuri);
    }
}
