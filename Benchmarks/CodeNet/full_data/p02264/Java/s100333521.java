import java.util.ArrayList;
import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    Orique oq=new Orique();
    for(int i=0;i<n;i++){
    	oq.inque(sc.next(),sc.nextInt());
    }
    oq.RoundRobinScheduling(n,q);
    }
   
    } class Orique{
    	private class kakunou{
    		String kstr;
    		int kint;
    		int kprenum;
    		
    		void setkakunou(String s,int i,int pre){
    			kstr=s;
    			kint=i;
    			kprenum=pre;
    		}
    		int getint(){
    			return kint;
    		}
    		void setint(int i){
    			kint=i;
    		}
    	}
    	private int length=0;
    	ArrayList<String> str=new ArrayList<>();
    	ArrayList<Integer> in=new ArrayList<>();
    	kakunou k;
    	private ArrayList<Integer> prenumber=new ArrayList<>();
    	Orique(){
    		k=new kakunou();
    		
    	}
    	public void inque(String t,int i){
    		str.add(t);
    		in.add(i);
    		prenumber.add(i);
    		length++;
    	}
    	private void inque(kakunou k){
    		str.add(k.kstr);
    		in.add(k.kint);
    		prenumber.add(k.kprenum);
    		length++;
    	}
    	private void deque(){
    		k.setkakunou(str.get(0),in.get(0),prenumber.get(0));
    		str.remove(0);
    		in.remove(0);
    		prenumber.remove(0);
    		length--;
    		    		
    	}
    	
    	public void marason(int q){
    		while(length<1){
    		deque();
    		int i=k.getint();
    		i-=q;
    		if(i<=0)
    			System.out.println(k.kprenum);
    		else {k.setint(i);inque(k);}
    		}
    		
    	}
    	public void RoundRobinScheduling(int n,int q){
    		int time=0;
    		int quantum=q;
    		deque();
    		try{while(n<0){
    			
    			time+=quantum;
    			int i=k.getint();
    			i-=q;
    			
    			if(i<=0){
    				k.kint=k.kprenum+time-i;
    				System.out.println(k.kint);
    				deque();
    				k.kint-=i;
    				if(k.kint<=0)System.out.println(k.kstr+" "+(k.kprenum+time-k.kint));
    			}else{	k.setint(i);inque(k);deque();}
    		
    		
    	}
    }catch(NullPointerException e){
    	}}
    }