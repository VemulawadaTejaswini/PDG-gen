import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder t = new StringBuilder();
        String res = "NO";
        int firstIndex = 0;
        
        while (true){
            if (s.length()<t.length()){
                break;
            }
            
            if (s.equals(t.toString())){
                res = "YES";
                break;
            }
            
            if (firstIndex+7 >=s.length()){
                break;
            }
            
            if (s.substring(firstIndex,firstIndex+"dream".length()).equals("dream")){
                t.append("dream");
                firstIndex += 5;
            }else if (s.substring(firstIndex,firstIndex+"dreamer".length()).equals("dreamer")){
                t.append("dream");
                firstIndex += 7;
            }else if (s.substring(firstIndex,firstIndex+"erase".length()).equals("erase")){
                t.append("erase");
                firstIndex += 5;
            }else if (s.substring(firstIndex,firstIndex+"eraser".length()).equals("eraser")){
                t.append("eraser");
                firstIndex += 6;
            }
        }

        System.out.println(res);
        
    }

}
