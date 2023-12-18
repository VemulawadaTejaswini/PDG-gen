import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < a; i++){
            String s = sc.next();
            char[] c = s.toCharArray();
            Arrays.sort(c);
            s = new String(c);
            list.add(s);
        }
        int count = 0;
        for(int i = 0; i < a; i++){
            for(int j = i + 1; j < a; j++){
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}