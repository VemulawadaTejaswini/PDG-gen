import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        LinkedList<String> enda = new LinkedList<>();
        LinkedList<String> startb = new LinkedList<>();
        LinkedList<String> other = new LinkedList<>();
        LinkedList<String> tmp = new LinkedList<>();
        
        for(int i = 0; i < n; i++){
            String s = sc.next();
            
            if(s.endsWith("A") && !s.startsWith("B")){
                enda.add(s);
            }else if(!s.endsWith("A") && s.startsWith("B")){
                startb.add(s);
            }else if(s.endsWith("A") && s.startsWith("B")){
                tmp.add(s);
            }else{
                other.add(s);
            }
        }
        
        for(String s : tmp){ //少ないほうに入れる
            if(enda.size() <= startb.size()){
                enda.add(s);
            }else{
                startb.add(s);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        boolean bool = false; //false = enda true = startb
        
        while(enda.size() != 0 || startb.size() != 0){
            if(enda.size() == 0){
                sb.append(startb.pop());
                continue;
            }else if(startb.size() == 0){
                sb.append(enda.pop());
                continue;
            }
            
            if(!bool){
                sb.append(enda.pop());
            }else{
                sb.append(startb.pop());
            }
            
            bool = !bool;
        }
        
        other.forEach(sb::append);
        
        int res = 0;
        
        for(int i = 1; i < sb.length(); i++){
            if(sb.charAt(i - 1) == 'A' && sb.charAt(i) == 'B') res++;
        }
        
        System.out.println(res);
    }
}
