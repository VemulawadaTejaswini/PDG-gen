import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String W = scan.next(); // ??°??????????±??????????
        int count = 0;
        String[] T = new String[1000];
        for(int i = 0; i < 1000; i++){
            T[i] = scan.next();
            if(T[i].equals("END_OF_TEXT")){
                break;
            }
            if(T[i].equals(W)){
                count++;
            }
        }
        System.out.println(count);
    }
}