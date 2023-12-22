import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tag = br.readLine();
        int count = Integer.parseInt(br.readLine());
        for(int k=0;k<count;k++){
            String[] order = br.readLine().split(" ");
            if(order[0].equals("print")){
                StringBuilder sb = new StringBuilder();
                int a=Integer.parseInt(order[1]);
                int b=Integer.parseInt(order[2]);
                for(int i=a;i<=b;i++)
                    sb.append(String.valueOf(tag.charAt(i)));
                System.out.println(sb.toString());
            }else if(order[0].equals("reverse")){
                StringBuilder sb = new StringBuilder();
                int a=Integer.parseInt(order[1]);
                int b=Integer.parseInt(order[2]);
                for(int i=0;i<a;i++)
                    sb.append(tag.charAt(i));
                for(int i=b;i>=a;i--)
                    sb.append(String.valueOf(tag.charAt(i)));//reverse
                for(int i=b+1;i<tag.length();i++)
                    sb.append(String.valueOf(tag.charAt(i)));
                tag = sb.toString();
            }else if(order[0].equals("replace")){
                StringBuilder sb = new StringBuilder();
                int a=Integer.parseInt(order[1]);
                int b=Integer.parseInt(order[2]);
                String rep = order[3];
                for(int i=0;i<a;i++)
                    sb.append(String.valueOf(tag.charAt(i)));
                sb.append(rep);//replace文を挿入
                for(int i=b+1;i<tag.length();i++)
                    sb.append(String.valueOf(tag.charAt(i)));
                tag = sb.toString();
            }else{}
        }
    }
}