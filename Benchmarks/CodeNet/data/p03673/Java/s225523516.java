import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        int time = Integer.parseInt(in.next());
        in.nextLine();
        String[] row = in.nextLine().split(" ");
        
        String out = "";
        
        if(time % 2 == 0){
            for(int i = 0; i < time/2; i++){
                out = row[i*2 + 1] + out +" "+  row[i*2] +" ";
            }
        }else {
            out = row[0] + " ";
            for(int i = 1; i < time/2; i++){
                out = row[i*2] + out + " "+  row[i*2 - 1] +" ";
            }
        }
        
        System.out.println(out);
        
    }
}
