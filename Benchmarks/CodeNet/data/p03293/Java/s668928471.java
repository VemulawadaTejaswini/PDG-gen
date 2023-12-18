import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] t = sc.nextLine().split("");
        int flag = 0;
        for(int i = 0;i<s.length();i++){            
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<s.length();j++){
                if(j-i<0){
                    sb.append(t[j-i+s.length()]);
                }else{
                    sb.append(t[j-i]);
                }
            }
            if(s.equals(sb.toString())){
                flag++;
                break;
            }
            sb.setLength(0);
        }
        if(flag == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}