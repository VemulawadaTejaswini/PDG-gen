import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        List<String> s=new ArrayList<>();
        int n=sc.nextInt();
        int[] count=new int[n];
        Arrays.fill(count,0);
        int b=1;
        s.add(sc.next());
        count[0]++;
        for(int i=1;i<n;i++){
            String str=sc.next();
            if(!s.contains(str)){
                s.add(str);
                count[b]++;
                b++;
            }else{
                count[s.indexOf(str)]++;
            }
        }
        int max=0;
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<b;i++){
            if(count[i]==max){
                q.add(i);
            }else if(count[i]>max){
                q.clear();
                q.add(i);
                max=count[i];
            }
        } 
        while(q.peek()!=null){
            System.out.println(s.get(q.remove()));
        }
    }
}