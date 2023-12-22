import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        myQueue que=new myQueue();
        
        int n=in.nextInt(),limit=in.nextInt(),sum=0;
        for(int i=0;i<n;i++)que.push(new process(in.next(), in.nextInt()));

        while(!que.isEmpty()){
            process p=que.pop();
            if(p.time<=limit){
                sum+=p.time;
                System.out.println(p.p+" "+sum);
            }
            else{
                sum+=limit;
                p.time-=limit;
                que.push(p);
            }
        }
    }
}

class process{
    String p;
    int time;

    process(String p,int time){
        this.p=p;
        this.time=time;
    }
}

class myQueue{
    process array[];
    int top,tail;

    myQueue(){
        array=new process[1000000];
        top=1; tail=1;
    }

    boolean isEmpty(){
        if(top==tail)return true;
        else return false;
    }

    void push(process x){
        array[tail]=x;
        tail++;
    }

    process pop(){
        process res=array[top];
        top++;
        return res;
    }
}
