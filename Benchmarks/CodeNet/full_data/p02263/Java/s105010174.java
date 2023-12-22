import java.util.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String[] a = new String[1000];
        int i = 0;
        a[i] = sc.next();
            try{
                while(a[i] != null){
                    boolean b = isNumber(a[i]);
                if(b){
                    list.add(Integer.parseInt(a[i]));
                }else{
                    if(a[i].equals("+")){
                        list.set(list.size()- 2, list.get(list.size()- 1) + list.get(list.size()- 2));
                        list.remove(list.size()-1);
                    }else if(a[i].equals("-")){
                        list.set(list.size()- 2, list.get(list.size()- 2) - list.get(list.size()- 1));
                        list.remove(list.size()- 1);
                    }else{
                        list.set(list.size()- 2, list.get(list.size()- 1) * list.get(list.size()- 2));
                        list.remove(list.size()- 1);
                    }
                }
                i++;
                a[i] = sc.next();
            }
                
        }catch(Exception e){
            
        }
            
        System.out.println(list.get(0));
    }
    public static boolean isNumber(String num) {
    try {
        Integer.parseInt(num);
        return true;
        } catch (NumberFormatException e) {
        return false;
    }
}
}


