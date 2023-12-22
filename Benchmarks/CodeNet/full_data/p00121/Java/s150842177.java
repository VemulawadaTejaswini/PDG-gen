import java.util.*;

class Main{

    int INF=1<<28;
    boolean[] flag;
    int goal;
    boolean debug=false;

    void run(){
	goal=0;
	int[] k={1,-1,4,-4};
	for(int i=0;i<8;i++)goal+=(1<<3*i)*i;
	Scanner sc=new Scanner(System.in);

	while(sc.hasNext()){

	    flag=new boolean[1<<3*8];
	    int x=0;
	    for(int i=0;i<8;i++){
		int kk=sc.nextInt();
		x+=kk<<3*i;
	    }

	    LinkedList<int[]> q=new LinkedList<int[]>();
	    q.offer(new int[]{x,0});

	    while(!q.isEmpty()){
		int[] a=q.poll();
		x=a[0];int count=a[1];
		
		if(debug){
		    for(int i=0;i<8;i++)System.out.print((x>>3*i)%8+" ");
		    System.out.println("count="+count);
		}

		if(x==goal){System.out.println(count);break;}
		flag[x]=true;

		int p=-1;
		for(int i=0;i<8;i++){
		    if((x>>3*i)%8==0)p=i;
		}

		for(int i=0;i<k.length;i++){
		    int pp=p+k[i];
		    if(pp>=0 && pp<8 &&(!((p==3 && i==0)||(p==4 && i==1)))){
			int z=(x>>3*pp)%8;
			int nx=x-(1<<3*pp)*z+(1<<3*p)*z;
			if(!flag[nx])q.offer(new int[]{nx,count+1});
		    }
		}
	    }
	    
	}
    }

    public static void main(String[] args){
	new Main().run();
    }
}