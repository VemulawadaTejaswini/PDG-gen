import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<String>();
    static String line;
    static int n;
    public static void main(String[] args) {

        while(read()){

        }
    }
    static boolean read(){
        if(!sc.hasNext())
            return false;
        n = sc.nextInt();sc.nextLine();
        for(int i = 0; i < n; i++){
            line = sc.nextLine().replace("Hoshino", "Hoshina");
            slove();
        }
        return true;
    }
    static void slove(){
        System.out.println(line);
    }

}