import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
	Scanner s=new Scanner(System.in);
	int i,n,m,gt=0;

	Queue<String>q=new LinkedList<String>();
	Queue<Integer>time=new LinkedList<Integer>();

	n=s.nextInt();
	m=s.nextInt();

	for(i=0;i<n;i++){
	    q.add(s.next());
	    time.add(s.nextInt());
	}

	while(0<q.size()){
	    if(0<(time.peek()-m)){
		q.add(q.poll());
		time.add(time.poll()-m);
		gt=gt+m;
	    }
	    else{
		gt=gt+time.poll();
		System.out.println(q.poll()+" "+gt);
	    }
	}
    }
}

