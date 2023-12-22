import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] color = {
                "\u001b[00;30m", //black
                "\u001b[00;31m", //red
                "\u001b[00;32m", //green
                "\u001b[00;33m", //yellow
                "\u001b[00;34m", //purple
                "\u001b[00;35m", //pink
                "\u001b[00;36m", //cyan
                "\u001b[00;37m", //white
                "\u001b[00m"    //end
        };

        for(int i = 1; i < 6; i++){
            int x = sc.nextInt();
            if(x == 0){
                System.out.println(color[8] + i);
                return;
            }
        }

    }
}
