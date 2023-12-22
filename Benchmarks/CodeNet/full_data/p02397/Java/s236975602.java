import java.util.Scanner;

public class Main {
    Main(){
        Scanner sc = new Scanner(System.in);
        int[] table = new int[2];
        table[0] = sc.nextInt();
        table[1] = sc.nextInt();
        if (table[0]!=0 && table[1] != 0) {
            java.util.Arrays.sort(table);
            System.out.println(table[0] + " " + table[1]);
        }
    }

    public static void main(String[] args){
        new Main();
    }
}

