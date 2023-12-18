import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        String[] array = n.split("");

        int frag = 0;
        for(String a : array){
            if(a.equals("7")){
                frag = 1;
            }
        }

        if(frag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}