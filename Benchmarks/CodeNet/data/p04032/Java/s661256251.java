import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().split("");
        int start = -1;
        int end = -1;
        for (int i = 0; i < strings.length -1; i++) {
            if(strings[i] == strings[i+1]){
                start = i;
                end = i+1;
                break;
            }
        }
        System.out.println(start + " " + end);
    }
}
