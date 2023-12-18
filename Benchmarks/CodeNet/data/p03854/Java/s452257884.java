import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        String S=sc.next();
        for(int i=S.length();i>0;i--){
            if(i>4){
                String s5=S.substring(i-5,i);
                if(s5.equals("dream")||s5.equals("erase")){
                    i-=4;
                    continue;
                }
                String s6=S.substring(i-6,i);
                if(s6.equals("dreamer")||s6.equals("eraser")){
                    i-=5;
                    continue;
                }
            }
            System.out.println("NO");
            return;
        }
        System.out.println("YES");
    }
}