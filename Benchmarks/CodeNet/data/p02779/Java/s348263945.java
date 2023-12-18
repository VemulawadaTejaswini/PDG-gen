import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l=new ArrayList<>();
        boolean end=false;
        l.add(sc.nextInt());
        for(int i=1;i<n;i++){
            int b=sc.nextInt();
            if(l.contains(b)){
                end=true;
            }else{
                l.add(b);
            }
        }
        if(end){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }
}