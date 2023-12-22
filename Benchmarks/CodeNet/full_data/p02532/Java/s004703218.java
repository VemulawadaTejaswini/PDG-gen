

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String order=br.readLine();
            ArrayDeque[] dq = new ArrayDeque[101];
            for(int i=0; i<101; i++){
                dq[i] = new ArrayDeque<Character>();
            }
            ArrayList<Character> al = new ArrayList<Character>();
            while(!order.equals("quit")){
                String[] splited = order.split(" ");
                if(splited[0].equals("push")){
                    dq[Integer.parseInt(splited[1])].addLast(splited[2].charAt(0));
                }
                if(splited[0].equals("pop")){
                    char pulled = (char)dq[Integer.parseInt(splited[1])].pollLast();
                    al.add(pulled);
                }
                else{//moved
                    char pulled = (char)dq[Integer.parseInt(splited[1])].pollLast();
                    dq[Integer.parseInt(splited[2])].addLast(pulled);
                }                
                order=br.readLine();
            }
            for(char ch : al)
                System.out.println(ch);
        }catch(Exception e){e.printStackTrace();}
    }
}