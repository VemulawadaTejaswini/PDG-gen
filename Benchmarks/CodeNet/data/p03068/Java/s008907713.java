import java.util.Scanner;
import java.util.ArrayList;
public class Main2 {
    public static void main(String args[]){
        Scanner sn = new Scanner(System.in);
        ArrayList<String> li = new ArrayList<String>();
        while (sn.hasNextLine()) {
            String str = sn.nextLine();
            li.add(str);
        }
        String[] moji = li[1].split("");
        String t = li.substring(li[2]+1,li[2]+1);
        for(int i=0;i<(int)li[0];i++){
            if(moji[i]==t){
            }
            else if(moji[i]!=t){
                moji[i]="*";
            }
        }
        System.out.println(moji);
    }
}
