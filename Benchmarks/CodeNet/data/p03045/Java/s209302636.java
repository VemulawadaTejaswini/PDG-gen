import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a;i++){
            map.put(i+1,-1);
        }
        int count=0,count2=0;
        for(int i=0;i<b;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            sc.nextInt();
            if(map.get(x)==-1&&map.get(y)==-1){
                map.put(x,x);
                map.put(y,x);
            }
            else if(map.get(x)!=-1&&map.get(y)!=-1)
                if(map.get(x)!=map.get(y))
                    map.put(map.get(y),map.get(x));
            else if(map.get(x)==-1)
                map.put(x,y);
            else map.put(y,x);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==-1||map.get(key)==key){
                count++;
            }
        }
        System.out.println(count);
    }
}