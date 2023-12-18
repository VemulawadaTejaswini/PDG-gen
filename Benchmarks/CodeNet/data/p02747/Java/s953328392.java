import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        if(input.length==1){
            System.out.println("No");
            return;
        }
        boolean hiString = true;
        for(int x =0; x<input.length-1; x+=2){
            if(!(input[x].equals("h") && input[x+1].equals("i"))){
                hiString = false;
                break;
            }
        }
        System.out.println(hiString?"Yes":"No");

    }

}
