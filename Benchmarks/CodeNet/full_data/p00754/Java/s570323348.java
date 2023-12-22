import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<Integer>();
        while(true){
           String s=sc.nextLine();
           if(s.equals("."))break;
           boolean ans=true;
           int n=s.length();
           st.clear();
           st.add(300);
        for(int i=0;i<n;i++){
            if(s.equals("."))break;
            if(s.charAt(i)=='(')st.add(1);
            if(s.charAt(i)=='[')st.add(2);
            if(s.charAt(i)==')'){
               int g= st.pop();
               if(g!=1){ans=false;
                break;
               }
            }
            if(s.charAt(i)==']'){
                int g= st.pop();
                if(g!=2){ans=false;
                        break;
                }
             }
            
            }
            if(st.size()!=1)ans=false;
            if(ans)System.out.println("yes");
            else System.out.println("no");
    }
}
}

