	import java.util.*;
	import java.math.*;
	import java.io.*;

	class Main
	{

		public static void main(String[] args)

		{
			new Main().run();
		}

		void run(){
			Scanner sc=new Scanner(System.in);
			int Q=sc.nextInt();
			long base=0;
			PriorityQueue<Long> left=new PriorityQueue<>();
			PriorityQueue<Long> right=new PriorityQueue<>();
			for(int i=0;i<Q;++i){
				int type=sc.nextInt();
				if(type==1){
					long a=sc.nextLong();
					long b=sc.nextLong();
					base+=b;
					if(left.isEmpty()&&right.isEmpty()){
						left.add(-a);
						right.add(a);
					}else if(-left.peek()==a&&right.peek()==a){
						left.add(-a);
						right.add(a);
					}else if(a<-left.peek()){
						left.add(-a);
						left.add(-a);
						base+=Math.abs(-left.peek()-a);
						right.add(-left.poll());
					}else{
						right.add(a);
						right.add(a);
						base+=Math.abs(right.peek()-a);
						left.add(-right.poll());
					}
				}else{
					System.out.println(-left.peek()+" "+base);
				}
			}
		}


		void tr(Object...objects){
			System.out.println(Arrays.deepToString(objects));
		}
	}
