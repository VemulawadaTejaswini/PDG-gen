import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            String line = sc.next();
            if(line.equals("-")){
                break;
            }else{
                int shuffleCount = sc.nextInt();
                for(int i = 0; i < shuffleCount; i++){
                    int cp = sc.nextInt();
                    line = shuffle(cp,line);
                }
                System.out.println(line);
            }
        }
        
    }
    public static String shuffle(int cuttingPoint, String line){
        return line.substring(cuttingPoint) + line.substring(0, cuttingPoint);
    }
}
