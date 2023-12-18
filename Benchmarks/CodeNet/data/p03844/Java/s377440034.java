import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(" ");
        int a = Integer.parseInt(in[0]);
        String opcode = in[1];
        int b = Integer.parseInt(in[2]);
        if(opcode.equals("+")){
            System.out.println(a+b);
        }else{
            System.out.println(a-b);
        }
    }
}