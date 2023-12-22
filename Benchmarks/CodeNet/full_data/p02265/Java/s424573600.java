import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
  
class Main {
    public static void main(String[] args) throws IOException {
        LinkedList<String> lnk=new LinkedList<String>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String s=br.readLine();
            String[] str=s.split(" ");
              
            if(s.equals("deleteFirst"))lnk.remove();
            else if(s.equals("deleteLast"))lnk.removeLast();
            else if(s.startsWith("insert"))lnk.addFirst(str[1]);
            else if(s.startsWith("delete")) lnk.remove(str[1]);
              
        }StringBuilder stb=new StringBuilder(lnk.poll());
        for(String i:lnk)stb.append(" "+i);
        System.out.println(stb);}}