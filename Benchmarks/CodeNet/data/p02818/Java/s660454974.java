import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] scan_str = scan.nextLine().split(" ");
        Long n1 = Long.parseLong(scan_str[0]);
        Long n2 = Long.parseLong(scan_str[1]);
        Long n4 = Long.parseLong(scan_str[2]);
        Long n3 = n1 + n2;
        Long n;
        if(n1+n2 < n4){
            n = n1+n2;
        }else{
            n = n4;
        }
        for(long i = 0 ; i < n; i++){
            n1 = n1 - Long.parseLong("1");
            n3 = n3 - Long.parseLong("1");
        }
        if(n1 < 0){
            System.out.println("0" + " " + String.valueOf(n3));
        }else{
            System.out.println(String.valueOf(n1) + " " + String.valueOf(n3 - n1));
        }

    }
}