import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        while(true){
            Main inst = new Main();
            Scanner scan = new Scanner(System.in);
            String text = scan.next();
            if (text.equals("0")){
                break;
            }
            else{
                System.out.println(inst.sum(text));
            }
        }
    }

    public int sum(String str){
        String[] array = str.split("");
        int stack = 0;
        for(String ar:array){
            stack += Integer.parseInt(ar);
        }
        return stack;
    }
}


