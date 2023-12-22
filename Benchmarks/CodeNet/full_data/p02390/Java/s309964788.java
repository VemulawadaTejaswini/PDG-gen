import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int s = scanner.nextInt();
        int sec, min, hour;
        
        hour = s/3600;
        s = s - hour*3600;
        min = s/60;
        s = s - min*60;
        sec = s;

        System.out.println(hour+":"+min+":"+sec);

        scanner.close();
    }
}

