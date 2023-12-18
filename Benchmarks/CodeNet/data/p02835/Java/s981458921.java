import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);

        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}

        if(a + b + c >= 22) {
        	System.out.println("bust");
        }else {
        	System.out.println("win");
        }


        //System.out.println();
        //System.out.print();

        stdIn.close();
    }
}
