import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] str = S.split("");
        int i = 0;
        boolean flag = false;
        while(i < str.length){
            if(S.substring(i).indexOf("dream") == -1 && S.substring(i).indexOf("erase") == -1) {
                System.out.println("NO");
                flag = true;
                break;
            }else if(S.substring(i, i + 5).equals("dream")){
                try {
                    if (str[i + 5].concat(str[i + 6]).equals("er")) {
                        if(i + 7 < str.length){
                            if(str[i + 7].equals("a")){
                                i = i + 5;
                            }else{
                                i = i + 7;
                            }
                        }else{
                            i = i + 5;
                        }
                    } else {
                        i = i + 5;
                    }
                }catch (ArrayIndexOutOfBoundsException e){
                    i = i + 5;
                }
            }else if(S.substring(i, i + 5).equals("erase")){
                try {
                    if (str[i + 5].equals("r")) {
                        i = i + 6;
                    } else {
                        i = i + 5;
                    }
                }catch(ArrayIndexOutOfBoundsException e){
                    i = i + 5;
                }
            }
        }
        if(!flag){
            System.out.println("YES");
        }
    }
}
