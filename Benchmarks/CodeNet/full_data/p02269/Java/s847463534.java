
import java.util.Scanner;

/**
 * C4
 */
public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int len = Integer.parseInt(sc.nextLine());
        int[] hash = new int[10000003];
        for(int i=0; i<len; i++){
            String[] command = sc.nextLine().split(" ");
            int key = Node.convertToInt(command[1])*3%10000003;
            switch (command[0]) {
                case "insert":
                    hash[key] = 1;
                    break;
                case "find":
                    String res = hash[key]==1 ? "yes": "no";
                    System.out.println(res);
                    break;
            }
        }
        sc.close();
    }


}

/**
 * Node
 */
class Node {
    public static int convertToInt(String str){
        int len = str.length();
        int converted = 0;
        for(int i=0; i<len; i++){
            converted += toInt(str.charAt(i))*Math.pow(5,i);
        }
        return converted;
    }
    private static int toInt(char c){
        int result = -1;
        switch (c) {
            case 'A':
                result = 3; 
                break;
            case 'C':
                result = 2;
                break;
            case 'G':
                result = 1;
                break;
            case 'T':
                result = 4;
                break;
        }
        return result;
    }
}
