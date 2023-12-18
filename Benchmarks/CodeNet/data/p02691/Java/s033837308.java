import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        Map<Integer,Integer> map= new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        int count =0;
        for(int j=0;j<n;j++)
        {
            int i=j+1;
            int saveme=sc.nextInt();
            if(map.get(i-saveme)!=null)
            {
                count=count+map.get(i-saveme);
            }


            if(map2.get(-saveme-i)!=null)
            {
                count = count+map2.get(-saveme-i);
            }

            map.putIfAbsent(saveme+i,0);
            map.put(saveme+i,map.get(saveme+i)+1);
            map2.putIfAbsent(saveme-i,0);
            map2.put(saveme-i,map2.get(saveme-i)+1);

        }

        System.out.println(count);


    }


}