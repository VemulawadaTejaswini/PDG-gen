import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{




	public static void main(String[] args){

		String array[];

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
		String str=reader.readLine();
		array=str.split(" ");
		int num=Integer.parseInt(array[0]);
		int q=Integer.parseInt(array[1]);
		int sum=0;
		Queue queue=new Queue(num);

		String x;
		int y;



		for(int i=0;i<num;i++){
			str=reader.readLine();
			queue.enqueue(str);
		}

		while(queue.num!=0){
			str=queue.dequeue();
			 array=str.split(" ");
			    x=array[0];
				y=Integer.parseInt(array[1]);

			    if(y>q){
			    	y=y-q;
			    	sum+=q;
			    	queue.enqueue(x+" "+y);
			    	} else{

			    	sum+=y;
			          System.out.println(x+" "+sum);
			    }
		}






		}catch(IOException e){

		}

	}//main
}

class Queue{
	int max;
	int num;
	String[] array;
	int front, rear;

	Queue(int capacity){//?????????????????????
		max=capacity;
		num=rear=front=0;
		array=new String[max];
	}
	public void enqueue(String str){
		array[rear++]=str;
		num++;
		if(rear==max)rear=0;
	}

	public String dequeue(){
		String str=array[front++];
		num--;
		if(front==max)front=0;

		return str;
	}

}//stack?????????