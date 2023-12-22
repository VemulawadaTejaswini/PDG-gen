import java.util.*;
import java.io.*;
class Main{
    public static void main(String args[]) throws IOException {
	
	int i,j,n,q,time=0,a;
	String c;
	String array[] = new String[100000];
	Scanner scan = new Scanner(System.in);
	Queue<Integer> que = new ArrayDeque<Integer>();
	Queue<String> ques = new ArrayDeque<String>();
	
	n = 2*scan.nextInt();
	q = scan.nextInt();
	
	for(i=0;i<n;i++){
	    array[i] = scan.next();
	}
	for(i=0;i<n;i+=2){
	    c = array[i];
	   ques.add(c);
	}
	for(i=1;i<n;i+=2){
	    a = Integer.parseInt(array[i]);
	    que.add(a);
	}
	
	i=1;
	while(true){
	    if(que.isEmpty()){break;}
	    //if(ques.isEmpty()){break;}
	    a = que.remove();
	    c = ques.remove();
	    if(a-q<=0){
		time += a;
		System.out.println(c+" "+time);
	    }
	    else {
		time += q;
		que.add(a-q);
		ques.add(c);
	    }
	}
	
    }
}

