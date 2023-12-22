import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        myLlist list=new myLlist();

        int n=in.nextInt();
        for(int i=0;i<n;i++){
            String cmd=in.next();
            if(cmd.equals("insert")){
                list.insert(Integer.parseInt(in.next()));
                // list.dump();
            }
            else if(cmd.equals("delete")){
                list.deleteOf(Integer.parseInt(in.next()));
            }
            else if(cmd.equals("deleteFirst")){
                list.deleteFirst();
            }
            else if(cmd.equals("deleteLast")){
                list.deleteLast();
            }
        }

        list.dump();
    }
}

class llNode{
    int num;
    llNode prev,next;

    llNode(int num){
        this.num=num;
    }
}

class myLlist{
    llNode dummy;
    int size;

    myLlist(){
        dummy=new llNode(-1);
        dummy.prev=dummy;
        dummy.next=dummy;

        size=0;
    }

    boolean isEmpty(){
        if(size==0)return true;
        else return false;
    }

    void insert(int x){
        llNode nnode=new llNode(x);

        nnode.next=dummy.next;
        nnode.prev=dummy;
        dummy.next.prev=nnode;
        dummy.next=nnode;
        
        size++;
    }

    void deleteOf(int x){
        llNode node=dummy.next;
        while(node.num!=-1){
            if(node.num==x)break;
            node=node.next;
        }
        if(node.num!=-1)delete(node);
    }
    
    void deleteFirst(){
        delete(dummy.next);
    }

    void deleteLast(){
        delete(dummy.prev);
    }

    private void delete(llNode dnode){
        dnode.prev.next=dnode.next;
        dnode.next.prev=dnode.prev;

        size--;
    }

    void dump(){
        PrintWriter out=new PrintWriter(System.out);
        List<Integer> list=new ArrayList<>();
        llNode node=dummy.next;

        while(node.num!=-1){
            list.add(node.num);
            node=node.next;
        }

        for(int i=0;i<list.size()-1;i++){
            out.print(list.get(i)+" ");
        }
        out.println(list.get(list.size()-1));
        out.flush();
    }
}
