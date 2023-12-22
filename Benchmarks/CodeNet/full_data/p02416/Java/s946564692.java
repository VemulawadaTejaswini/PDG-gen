import java.util.Scanner;                                                   

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            String a = in.nextLine();
            if(a.equals("0")){
                break;
            }
            int s = 0;
            String sary[] = a.split("");
            for (int i = 0; i < a.length(); i++){
                s += Integer.parseInt(sary[i]);
            }
            System.out.println(s);
        }
        }
}