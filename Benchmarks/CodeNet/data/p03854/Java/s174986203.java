import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "NO";
        
        while (true){
            if (s.isEmpty()){
                res = "YES";
                break;
            }
            if (s.length() < 5){
                break;
            }
            
            if(s.startsWith("dream")){
               s = s.substring(s.indexOf("dream")+"dream".length());
               if (s.startsWith("eraser")){
                   s = s.substring(s.indexOf("eraser")+"eraser".length());
               }else if (s.startsWith("erase")){
                   s = s.substring(s.indexOf("erase")+"erase".length());
               }else if (s.startsWith("er")){
                   s = s.substring(s.indexOf("er")+"er".length());
               }
               
            }else if (s.startsWith("erase")){
                s = s.substring(s.indexOf("erase")+"erase".length());
                if (s.startsWith("eraser")){
                    s = s.substring(s.indexOf("eraser")+"eraser".length());
                }else if (s.startsWith("r")){
                    s = s.substring(s.indexOf("r")+"r".length());
                }
            }else{
                break;
            }
        }

        System.out.println(res);
        
    }

}
