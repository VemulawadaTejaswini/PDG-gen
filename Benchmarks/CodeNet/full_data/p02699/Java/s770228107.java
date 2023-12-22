import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        String[] array = data.split(" ");
        int s = Integer.parseInt(array[0]);
        int w = Integer.parseInt(array[1]);
        
        String result = "safe";
        
        if(w >= s)
        {
            result = "unsafe";
        }
        
        System.out.println(result);
    }
}
