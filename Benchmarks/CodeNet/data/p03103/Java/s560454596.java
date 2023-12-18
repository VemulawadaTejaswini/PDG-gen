import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map <String,String>map=new TreeMap<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            String key=sc.next();
            String value=sc.next();
            map.put(key,value);
        }
        long total=0;
        for(int i=1;i<=1000000000;i++){
            if(map.containsKey(String.valueOf(i))){
                if(m>=Integer.parseInt(map.get(String.valueOf(i)))){
                    m-=Integer.parseInt(map.get(String.valueOf(i)));
                    total+=Integer.parseInt(map.get(String.valueOf(i)))*i;
                }else{
                    total+=m*i;
                    break;
                }
            }
        }
        System.out.println(total);
    }
}
