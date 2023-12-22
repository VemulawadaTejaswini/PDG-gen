import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        String[] arr={"AC", "WA" ,"TLE", "RE" };
        for(int i=0;i<n;i++){
            String str=sc.next();
            if(map.containsKey(str)){
                int value=map.get(str)+1;
                map.put(str, value);
            }
            else
            map.put(str,1);
        }
        for(int i=0;i<4;i++){
            if(map.containsKey(arr[i]))
            System.out.println(arr[i]+" x "+map.get(arr[i]));
            else
            System.out.println(arr[i]+" x "+0);
        }
        
    }
}