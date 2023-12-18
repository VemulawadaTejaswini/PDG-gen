import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = String.valueOf("1");
        for(int i = 0;i<s.length();i++){
            if(s.length() %2 == 0 && i==0){
                s = s.substring(0,s.length()-1);
            }
            if(s.length() %2 == 0){
                if(s.substring(0,s.length()/2).equals(s.substring(s.length()/2,s.length()))){
                    answer = s;
                }
                s = s.substring(0,s.length()-1);
            }else{
                s = s.substring(0,s.length()-1);
            }
        }
        System.out.println(answer.length());
    }
}