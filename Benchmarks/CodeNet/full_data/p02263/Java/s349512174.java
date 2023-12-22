import java.io.*;
class Sta{
    int[] s;
    int top;
    Sta(){
        s=new int[1000];
        top=0;
    }
    void push(int x){
        top++;
        s[top]=x;
    }
    int pop(){
        top--;
        return s[top+1];
    }
}
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader din=new BufferedReader(new InputStreamReader(System.in));
        String line=din.readLine();
        String[] tokens=line.split(" ");
        Sta stack=new Sta();
        for(int i=0;i<tokens.length;i++){
            String x=tokens[i];
            if(x.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }else if(x.equals("-")){
                stack.push(-stack.pop()+stack.pop());
            }else if(x.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else{
                int t=Integer.parseInt(x);
                stack.push(t);
            }
        }
        System.out.println(stack.pop());
    }
}