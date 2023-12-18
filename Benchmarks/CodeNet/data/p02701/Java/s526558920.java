import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        HashMap<String,String> map = new HashMap<String,String>();
        try{
            while(true){
                str.add(sc.nextLine());    
            }
        } catch(Exception e){
        }
        int count = 0;
        for(int i=1;i<=Integer.parseInt(str.get(0));i++){
            if(!map.containsKey(str.get(i))){
                map.put(str.get(i),"OK");
                count++;
            }
        }
        System.out.println(count);
    }
}
