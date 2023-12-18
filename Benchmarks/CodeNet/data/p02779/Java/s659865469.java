import java.util.*;
public class Main{

     public static void main(String []args){
        
        
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] splt = scanner.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        for(String sp: splt){
            list.add(sp);
        }
        Collections.sort(list);
        String answer = "YES";
        for(int x = 0; x<N-1; x++){
            if(list.get(x).equals(list.get(x+1))){
                answer = "NO";
                break;
            }
        }
        System.out.println(answer);
        
        
        
     }
}