import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Queue<String> que=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        if(k<=12){
            System.out.println(k);
            System.exit(0);
        }
        int count=2;
        for(int i=2;i<=12;i++){
            que.add(Integer.toString(i));
        }
        while(true){
            if(count==k){
                break;
            }
            String str=que.remove();
            
            int l=str.length();
            int i=(str.charAt(l-1)=='0' ? 0 : -1);
            int j=(str.charAt(l-1)=='9' ? 0 : 1);
            for(;i<=j;i++){
                que.add(str + (char)(str.charAt(l-1)+i));
            }
            count++;
        }
        System.out.println(que.remove());
    }
}