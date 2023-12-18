import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] moji = s.toCharArray();

        for(int i = 0;i<s.length();i++){
            if(moji[i]+n>90){
                System.out.print((char)(((moji[i]+n)-26)));
            }else{
                System.out.print((char)(moji[i]+n));
            }
        }

        

      
    }
}
