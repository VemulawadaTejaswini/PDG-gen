import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(Main.change(str));
        }

    public static String change(String str){
        String[] array = str.split("");
        int len = array.length;
        String stack = "";
        for(int i=0; i<len; i++){
            String ar = array[i];
            if(ar.matches("[A-Z]")){
                stack += ar.toLowerCase();
            }
            else{
                stack += ar.toUpperCase();
            }
        }
        return stack;
    }
}

