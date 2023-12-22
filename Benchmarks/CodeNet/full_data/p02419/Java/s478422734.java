import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String W = sc.nextLine();
        String T = "";
        String[] T_split;

        int count = 0;
        while(true){
            T = sc.nextLine();
            if(T.equals("END_OF_TEXT")) break;  //終了条件
            T_split = T.split(" ",0);
            for(int i = 0;i < T_split.length;i++){
                T_split[i] = T_split[i].toLowerCase();
                if(T_split[i].matches(W))  count++;
            }
        }
        System.out.println(count);
    }
}
