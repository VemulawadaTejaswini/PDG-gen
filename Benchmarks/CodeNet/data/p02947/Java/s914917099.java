import java.util.*;
import java.util.Arrays;

class Main{
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        String[] str = new String[N];
        for(int i = 0; i < N; i++){
            str[i] = scanner.next();
        }
        
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                String[] str1 = str[i].split("");
                String[] str2 = str[j].split("");
                Arrays.sort(str1);
                Arrays.sort(str2);
                
                if(Arrays.equals(str1, str2)){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}