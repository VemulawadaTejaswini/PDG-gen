import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc. nextLine();
        
        char []str_t_char = str.toCharArray();
        char []ACGT = {'A', 'C', 'G', 'T'};
        
        int count = 0;
        int max_str = 0;
        
        for (int i = 0; i < str_t_char.length; i++){
            boolean flag = false;
            for (int iter = 0; iter < ACGT.length; iter++){
                if (str_t_char[i] == ACGT[iter]){
                    flag = true;
                    count++;
                    break;
                }
            } 
            
            if (flag == false){
                max_str = Math.max(max_str, count);
                count = 0;
            }
        } 
        System.out.println(max_str);
    }
}
