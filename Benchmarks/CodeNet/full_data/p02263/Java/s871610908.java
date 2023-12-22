import java.util.*;
public class Main{
    public static void main (String args[]){

        //初期処理
        Scanner sc=new Scanner(System.in);
        // int n=Integer.parseInt(sc.nextLine());
        // String[] sArray = sc.nextLine().split(" ");
        // int[] array=Arrays.stream(sArray).mapToInt(Integer::parseInt).toArray();

        String[] strArray = sc.nextLine().split(" ");
        Stack stack= new Stack(300);
        int answer=0;
        int a,b;

        for (String s:strArray){
            switch (s) {
                case "+":
                    a=Integer.parseInt(stack.pop());
                    b=Integer.parseInt(stack.pop());
                    answer=b+a;
                    stack.push(Integer.toString(answer));
                    break;
                
                case "-":
                    a=Integer.parseInt(stack.pop());
                    b=Integer.parseInt(stack.pop());
                    answer=b-a;
                    stack.push(Integer.toString(answer));
                    break;
                
                case "*":
                    a=Integer.parseInt(stack.pop());
                    b=Integer.parseInt(stack.pop());
                    answer=b*a;
                    stack.push(Integer.toString(answer));
                    break;
                case "/":
                    a=Integer.parseInt(stack.pop());
                    b=Integer.parseInt(stack.pop());
                    answer=b/a;
                    stack.push(Integer.toString(answer));
                    break;
                default:
                    stack.push(s);
                    break;
            }
        }
            System.out.println(answer);
        // String[] sArray2 = Arrays.stream(array).mapToObj(Integer::toString).toArray(s->new String[s]);
        // System.out.println(String.join(" ", sArray2));
        // System.out.println(count);
    }
}


class Stack {
    //メンバ変数
    private int top=0;
    private int n;          //配列サイズ
    private String[] stackArray;


    //コンストラクタ    
    public Stack(int n){
        this.n=n;
        stackArray=new String[n];
    }
    //ゲッターセッター
    public int getTop(){
        return top;
    }
    public int getN(){
        return n;
    }
    public String[] getstackArray(){
        return stackArray;
    }
    public void setTop(int top){
        this.top=top;
    }
    public void setN(int n){
        this.n=n;
    }
    public void setstackArray(String[] stackArray){
        this.stackArray=stackArray;
    }

    //メソッド
    public void push(String data){
        if (this.isFull()==false){
            stackArray[top+1]=data;
            top++;
        } else{;}
    }

    public String pop(){
        if (this.isEmpty()==false){
            String popedData=stackArray[top];
            stackArray[top]=null;
            top--;
            return popedData;
        } else{
            throw new NullPointerException();
        }
    }

    public boolean isFull(){
        if (top==n-1){
            return true;
        } else if (top<n-1){
            return false;
        }else{
            throw new NullPointerException();
        }
    }

    public boolean isEmpty(){
        if (top==0){
            return true;
        } else if (top>0){
            return false;
        }else{
            throw new NullPointerException();
        }
    }
}
