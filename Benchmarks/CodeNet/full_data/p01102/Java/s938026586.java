import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        while(true){
            String s1 = sc.nextLine();
            if(s1.equals(".")) break;
            String s2 = sc.nextLine();
            boolean flag = true;
            int cnt = 0;
            while(true){
                int i = s1.indexOf("\"");
                int j = s2.indexOf("\"");
                if(i != j) {
                    flag = false;
                    break;
                }
                if(i == -1 && j == -1){
                    if(! s1.equals(s2)){
                        flag = false;
                        break;
                    }else{
                        break;
                    }
                }
                String ss1 = s1.substring(0, i + 1);
                String ss2 = s2.substring(0, j + 1);
                if(! ss1.equals(ss2)){
                    flag = false;
                    break;
                }
                s1 = s1.substring(i + 1, s1.length() + 1);
                s2 = s2.substring(j + 1, s2.length() + 1);
                
                i = s1.indexOf("\"");
                j = s2.indexOf("\"");
                ss1 = s1.substring(0, i + 1);
                ss2 = s2.substring(0, j + 1);
                if(! ss1.equals(ss2)){
                    cnt++;
                }
                s1 = s1.substring(i + 1, s1.length() + 1);
                s2 = s2.substring(j + 1, s2.length() + 1);
            }
            
            if(! flag){
                System.out.println("DIFFERENT");
            }else if(cnt >= 2){
                System.out.println("DIFFERENT");
            }else if(cnt == 0){
                System.out.println("IDENTICAL");
            }else{
                System.out.println("CLOSE");
            }
            
        }
    }
}

