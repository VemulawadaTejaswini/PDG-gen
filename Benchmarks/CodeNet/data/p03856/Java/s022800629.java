
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String []PARTS = {"dream","dreamer","erase","eraser"};
        boolean flag = true;
        boolean able = true;
        int cnt = 0;
        while(flag) {
            flag = false;
//            for (int i = 0; i < PARTS.length; i++) {
//                if (input.endsWith(PARTS[i])) {
                    //input = input.substring(0, input.length() - PARTS[i].length());
                    //input = input.substring(input.length()-6-cnt,input.length()-cnt);
                    String tmp = input.substring(input.length()-5-cnt,input.length()-cnt);
                    if(tmp.equals(PARTS[0])||tmp.equals(PARTS[2])){
                        cnt +=5;
                        flag = true;
                    }
                    else{
                        tmp = input.substring(input.length()-6-cnt,input.length()-cnt);
                        if(tmp.equals(PARTS[3])){
                            cnt+=6;
                            flag = true;
                        }
                        else{
                            tmp = input.substring(input.length()-7-cnt,input.length()-cnt);
                            if(tmp.equals(PARTS[2])){
                                cnt+=7;
                                flag = true;
                            }
                        }
//                    }
//                }
            }
            if (input.length()==0) able =true;
            else able = false;
        }

        if(able){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();

    }

}
