import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = 0;
        while(index < s.length()){
            System.out.println(c);
            if(c == 'd'){
                if(index + 5 > s.length()){
                    break;
                }
                if(index+7 < s.length() && (s.charAt(index+7) != 'a') || index+7 == s.length()){
                    if(s.substring(index,index+7).equals("dreamer")){
                        index += 7;
                    }else{
                        if(s.substring(index,index+5).equals("dream")){
                            index += 5;
                        }else{
                            break;
                        }
                    }
                }else{
                    if(s.substring(index,index+5).equals("dream")){
                        index += 5;
                    }else{
                        break;
                    }
                }
            }else if(c == 'e'){
                if(index + 5 > s.length()){
                    break;
                }
                if(index + 5 == s.length() || s.charAt(index+5) != 'r'){
                    if(s.substring(index,index+5).equals("erase")){
                        index += 5;
                    }else{
                        break;
                    }
                }else{
                    if(s.substring(index,index+6).equals("eraser")){
                        index += 6;
                    }else{
                        break;
                    }
                }
            }else{
                break;
            }
        }
        System.out.println(index == s.length() ? "YES" : "NO");
    }
}
