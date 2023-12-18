import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        in.nextLine();
        String[] row = in.nextLine().split(" ");
        
        String out = "";
        int i;
        for (i = time; i > 0; i = i-2){
            out += row[i-1] + " ";
        }
        for(int j = (i == 0? 1 : 2); j < time; j = j + 2){
            out += row[j-1] + " ";
        }
        
        System.out.println(out);
        
    }
}
