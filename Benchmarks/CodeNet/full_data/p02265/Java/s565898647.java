import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
   
class Main {
    public static void main(String[] args) throws IOException {
        Deque<Integer> lnk=new LinkedList<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String s=br.readLine();
                           
            if(s.equals("deleteFirst"))lnk.remove();
            else if(s.equals("deleteLast"))lnk.removeLast();
            else{ 
                if(s.startsWith("insert"))lnk.addFirst(Integer.parseInt(s.substring(7)));
            else if(s.startsWith("delete")) lnk.remove(Integer.parseInt(s.substring(7)));
            }  
        }StringBuilder stb=new StringBuilder(Integer.toString(lnk.poll()));
        for(Integer i:lnk)stb.append(" "+i);
        System.out.println(stb);}
     
    }