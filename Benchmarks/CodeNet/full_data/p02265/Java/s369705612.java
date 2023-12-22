import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
   
public class Main {
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
     
    public void exec() throws IOException {
        SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.readInt();
        DoublyLinkedList dl = new DoublyLinkedList(n);
        for(int i=0; i<n; i++) {
            String[] cmd = in.br.readLine().split(" ");
            if(cmd[0].equals("insert")){
            	dl.insert(Integer.parseInt(cmd[1]));
            } else if(cmd[0].equals("delete")){
            	dl.delete(Integer.parseInt(cmd[1]));
            } else if(cmd[0].equals("deleteFirst")){
            	dl.deleteFirst();
            } else {
            	dl.deleteLast();
            }
        }
        out.println(dl.toString());
        out.flush();
    }
}
 
class DoublyLinkedList {
    public int head = 0;
    public int tail = 0;
    public int[] list = null;
    
    public DoublyLinkedList(int n){
    	list = new int[n];
    }
    
    public boolean isEmpty(){
    	return head==tail;
    }
    
    public void insert(int x) {
        list[head++]=x;
    }
     
    public void deleteFirst() {
    	if(isEmpty()) new IllegalStateException();
        head--; 
        while(tail<head && list[head-1]<0){
        	head--;
        }
    }
     
    public void deleteLast() {
    	if(isEmpty()) new IllegalStateException();
        tail++;
        while(tail<head && list[tail]<0){
        	tail++;
        }
    }
     
    public void delete(int x) {
    	if(isEmpty()) new IllegalStateException();
    	if(list[head-1]==x){
    		deleteFirst();
    	} else {
            for(int i=head-1; i>=tail; i--){
            	if(list[i]<0) continue;
            	if(list[i]==x) {
            		if(tail == i)
            			deleteLast();
            		else
            			list[i]=-1;
            		break;
            	}
            }
    	}
    }
     
    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(int i=head-1; i>=tail; i--){
        	if(list[i]<0) continue;
            if(first) {
            	first = false;
            }else{
                sb.append(" ");
            }
            sb.append(list[i]);
        }
        return sb.toString();
    }
 
}
 
class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
    public String[] readStrArray(String delim) throws NumberFormatException, IOException{
        return br.readLine().split(delim);
    }
     
    public int readInt() throws NumberFormatException, IOException{
        return Integer.parseInt(br.readLine());
    }
     
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
                if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
                }
            }
        }
        return a;
    }
 
     
}