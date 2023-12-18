import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        String str[] = w.split("");
        Arrays.sort(str);
        
        int count = 1;
        for(int i = 0 ; i < w.length()-1 ; ++i){
            if(str[i].equals(str[i+1])){
                count++;
            }else if(count%2==1){
                System.out.println("No");
                return;
            }else{
                count = 1;
            }
        }
        if(count%2==1){
            System.out.println("NO");
            return;
        }
        System.out.println("Yes");
        
    }
}
