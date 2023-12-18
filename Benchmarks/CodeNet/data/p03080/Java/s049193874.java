import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int red =0;
        int blue =0;
        
        for(int i=0; i<s.length() ; i++){
            if(s.charAt(i) == 'R'){
                red++;
            }
            else{
                blue++;
            }
        }

        if(red>blue){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
