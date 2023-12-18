import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char as = 'a';
        while(as<='z'&&!judge(s,as)){
            as ++;
        }
        if(as>'z'){
            System.out.println("None");
        } else {
            System.out.println(as);
        }
    }
    public static boolean judge(char[] s,char as){
        for(int i=0;i<s.length;i++){
            if(as==s[i]){
                return false;
            }
        }
        return true;
    }
}