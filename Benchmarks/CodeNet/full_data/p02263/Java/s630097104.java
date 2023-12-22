import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        myStack stk=new myStack();
        String[] data=in.nextLine().split(" ");
        for(int i=0;i<data.length;i++){
            String obj=data[i];
            
            if(obj.equals("+") || obj.equals("*") || obj.equals("-")){
                char odr=obj.charAt(0);
                if(odr==' ')continue;
                int a=stk.pop(),b=stk.pop();
                switch(odr){
                    case '+':
                    stk.push(b+a);
                    break;

                    case '-':
                    stk.push(b-a);
                    break;

                    case '*':
                    stk.push(b*a);
                    break;
                }
            }
            else{
                stk.push(Integer.parseInt(obj));
            }
            //stk.dump();
        }

        System.out.println(stk.peek());
    }
}

class myStack{
    int array[],top;

    myStack(){
        array=new int[1000];
        top=0;
    }

    boolean isEmpty(){
        if(top==0)return true;
        else return false;
    }

    int size(){
        return top;
    }

    void push(int x){
        top++;
        array[top]=x;
    }

    int peek(){
        return array[top];
    }

    int pop(){
        int res=array[top];
        top--;
        return res;
    }

    void dump(){
        for(int i=1;i<=top;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
