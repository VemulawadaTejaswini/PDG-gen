import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char array[] = s.toCharArray();

        if(array[0]==array[1] || array[1]==array[2] || array[2]==array[3]){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }

    }
}