import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        
        int x = cin.nextInt();
        int y = cin.nextInt();
        cin.close();
        String result = "NO";
        
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        
        for(int i = 1;i<=12;i++){
            if(i==2){
                map.put(i,"C");
            }else if(i<8){
                if(i%2==0){
                    map.put(i,"A");
                }else{
                    map.put(i,"B");
                }
            }else{
                if(i%2==0){
                    map.put(i,"B");
                }else{
                    map.put(i,"A");
                }
            }
        }
        
        if(map.get(x).equals(map.get(y))){
            result = "YES";
        }    
        System.out.println(result);    
    }
}