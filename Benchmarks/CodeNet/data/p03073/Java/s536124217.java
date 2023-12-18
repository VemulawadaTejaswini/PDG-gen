import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.nextLine().toCharArray();
        char tmp = n[0];
        int count = 0;
        for(int i = 0;i<n.length;i++){
            if(n.length-1 != i){
                if(n[i] == n[i+1]){
                    count++;
                    if(n[i] == '0'){
                        n[i+1] = '1';
                    }else{
                        n[i+1] = '0';
                    }
                }
            }
        }
        System.out.println(count);
    }
}