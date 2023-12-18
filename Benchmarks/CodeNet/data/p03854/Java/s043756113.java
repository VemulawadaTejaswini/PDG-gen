import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String str = "YES";
        while(s.length() != 0){
            if     (s.lastIndexOf("dream")  ==s.length()-5) s = s.substring(0,s.length()-5);
            else if(s.lastIndexOf("dreamer")==s.length()-7) s = s.substring(0,s.length()-7);
            else if(s.lastIndexOf("erase")  ==s.length()-5) s = s.substring(0,s.length()-5);
            else if(s.lastIndexOf("eraser") ==s.length()-6) s = s.substring(0,s.length()-6);
            else{
                s = "";
                str = "NO";
            }
        }

        System.out.println(str);
    }
}
