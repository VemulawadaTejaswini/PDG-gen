import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        char [] str = new char [w.length()];
        
        for(int i=0; i<w.length(); i++){
            str[i] = w.charAt(i);
        }
        
        Arrays.sort(str);
        char tmp = str[0];
        ArrayList <Integer> list = new ArrayList<>();
        int count = 1;
        boolean judge = true;
        
        for(int i=1; i<w.length(); i++){
            if(tmp == str[i]){
                count++;
            }else{
                list.add(count);
                count = 1;
                tmp = str[i];
        }
        }
        
        list.add(count);
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%2 == 1){
                judge = false;
                break;
            }
        }
        
        if(judge) System.out.println("Yes");
        else System.out.println("No");
}

}