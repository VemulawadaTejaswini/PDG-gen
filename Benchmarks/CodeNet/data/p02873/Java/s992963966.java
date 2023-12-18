import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char[] cl = sc.next().toCharArray();
        int[] min = new int[cl.length];
        int ans = 0;
        for(int i = 0; i <= cl.length; i++){
            ans += Math.max(checkLeft(cl,i-1),checkRight(cl,i)); 
        }
        System.out.println(ans);
    }
    
    public static int checkLeft(char[] cl,int index){
        int ret = 0;
        while(index >= 0 && cl[index] == '<'){
            ret++;
            index--;
        }
        return ret;
    }
    
    public static int checkRight(char[] cl,int index){
        int ret = 0;
        while(index < cl.length && cl[index] == '>'){
            ret++;
            index++;
        }
        return ret;
    }
}
