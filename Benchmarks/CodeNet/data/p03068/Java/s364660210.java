import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();//文字数
        String s = sc.next();;//文字列
        int k = sc.nextInt();//指定文字番
        
        String[] array = new String[n];
        array = s.split("");
        String ss = array[k];
        
        for(int i = 0; i<n; i++){
            if(!array[i].equals(ss)){
                array[i] = "*";
            }
        }
        
        for(String sss : array){
            System.out.println(sss);
        }
    }
}